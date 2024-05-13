package com.maids.salesmanagements.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public Long addNewClient(Client client) {
        validateEmail(client.getEmail());
        Client savedClient = clientRepository.save(client);
        return savedClient.getId();
    }

    public void updateClient(Long clientId, Client updatedClient) {
        Client client = getClientById(clientId);
        validateEmail(updatedClient.getEmail(), clientId);
        updateClientFields(client, updatedClient);
        clientRepository.save(client);
    }

    public void deleteClient(Long clientId) {
        Client client = getClientById(clientId);
        clientRepository.delete(client);
    }

    private Client getClientById(Long clientId) {
        return clientRepository.findById(clientId)
                .orElseThrow(() -> new IllegalStateException("Client with id " + clientId + " does not exist"));
    }

    private void validateEmail(String email) {
        Optional<Client> existingClient = clientRepository.findClientByEmail(email);
        if (existingClient.isPresent()) {
            throw new IllegalStateException("Email already exists");
        }
    }

    private void validateEmail(String email, Long clientId) {
        Optional<Client> existingClient = clientRepository.findClientByEmail(email);
        if (existingClient.isPresent() && !existingClient.get().getId().equals(clientId)) {
            throw new IllegalStateException("Email already exists");
        }
    }

    private void updateClientFields(Client client, Client updatedClient) {
        client.setName(updatedClient.getName());
        client.setLastName(updatedClient.getLastName());
        client.setMobile(updatedClient.getMobile());
        client.setEmail(updatedClient.getEmail());
        client.setAddress(updatedClient.getAddress());
    }
}
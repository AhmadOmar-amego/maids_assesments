package com.maids.salesmanagements.Client;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/clients")
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public ResponseEntity<List<Client>> getClients() {
        List<Client> clients = clientService.getClients();
        return ResponseEntity.ok(clients);
    }

    @PostMapping
    public ResponseEntity<String> createClient(@Valid @RequestBody Client client) {
        Long clientId = clientService.addNewClient(client);
        return ResponseEntity.status(HttpStatus.CREATED).body("Client created with ID: " + clientId);
    }

    @PutMapping(path = "{clientId}")
    public ResponseEntity<String> updateClient(
            @PathVariable("clientId") Long clientId,
            @Valid @RequestBody Client updatedClient) {
        clientService.updateClient(clientId, updatedClient);
        return ResponseEntity.ok("Client updated successfully");
    }

    @DeleteMapping(path = "{clientId}")
    public ResponseEntity<String> deleteClient(@PathVariable("clientId") Long clientId) {
        clientService.deleteClient(clientId);
        return ResponseEntity.ok("Client deleted successfully");
    }
}
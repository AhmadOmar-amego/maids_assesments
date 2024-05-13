import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class NumberWithIndex {
    private int number;
    private int index;

    public NumberWithIndex(int number, int index) {
        this.number = number;
        this.index = index;
    }

    public int getNumber() {
        return number;
    }

    public int getIndex() {
        return index;
    }
}

interface TripletFinderAlgorithm {
    List<int[]> findTriplets(NumberWithIndex[] nums, int sum);
}

class TripletFinderBruteForce implements TripletFinderAlgorithm {
    @Override
    public List<int[]> findTriplets(NumberWithIndex[] nums, int sum) {
        List<int[]> triplets = new ArrayList<>();

        for (int i = 0; i <= nums.length - 3; i++) {
            int remainingSum = sum - nums[i].getNumber();
            int leftIndex = i + 1;
            int rightIndex = nums.length - 1;

            while (leftIndex < rightIndex) {
                int currentSum = nums[leftIndex].getNumber() + nums[rightIndex].getNumber();

                if (currentSum < remainingSum) {
                    leftIndex++;
                } else if (currentSum > remainingSum) {
                    rightIndex--;
                } else {
                    triplets.add(new int[]{nums[i].getIndex(), nums[leftIndex].getIndex(), nums[rightIndex].getIndex()});
                    leftIndex++;
                    rightIndex--;
                }
            }
        }

        return triplets;
    }
}

class TripletFinderOptimized implements TripletFinderAlgorithm {
    @Override
    public List<int[]> findTriplets(NumberWithIndex[] nums, int sum) {

        return new ArrayList<>();
    }
}

class InputReader {
    private Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    public int readSize() {
        System.out.print("Enter the number of elements in the array: ");
        return scanner.nextInt();
    }

    public NumberWithIndex[] readNumbersWithIndices(int size) {
        NumberWithIndex[] nums = new NumberWithIndex[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = new NumberWithIndex(scanner.nextInt(), i);
        }
        return nums;
    }

    public int readTargetSum() {
        System.out.print("Enter the target sum: ");
        return scanner.nextInt();
    }
}

class OutputPrinter {
    public void printTriplets(List<int[]> triplets) {
        System.out.println("\nIndexes Triplets with a sum of " + triplets.size());

        for (int[] triplet : triplets) {
            System.out.println("(" + triplet[0] + " " + triplet[1] + " " + triplet[2] + ")");
        }
    }
}

public class FindAllTriplets {
    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        OutputPrinter outputPrinter = new OutputPrinter();

        int size = inputReader.readSize();
        NumberWithIndex[] nums = inputReader.readNumbersWithIndices(size);
        int sum = inputReader.readTargetSum();

        Arrays.sort(nums, (a, b) -> a.getNumber() - b.getNumber());

        TripletFinderAlgorithm tripletFinderAlgorithm = new TripletFinderBruteForce();
        List<int[]> triplets = tripletFinderAlgorithm.findTriplets(nums, sum);

        outputPrinter.printTriplets(triplets);
    }
}
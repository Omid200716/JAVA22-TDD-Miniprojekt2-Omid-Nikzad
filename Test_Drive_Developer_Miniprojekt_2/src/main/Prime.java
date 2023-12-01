package main;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    private final List<Integer> primes;
    private final int count;
    private final int sumOfPrimes;

    public Prime(int from, int to) {
        if (from < 0 || to > 1000 || from > to) {
            throw new IllegalArgumentException("Oops, wrong range specified!");
        }
        this.primes = calculatePrimes(from, to);
        this.count = primes.size();
        this.sumOfPrimes = primes.stream().mapToInt(Integer::intValue).sum();
    }

    private List<Integer> calculatePrimes(int from, int to) {
        List<Integer> primes = new ArrayList<>();
        for (int i = from; i <= to; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> getPrimes() {
        return primes;
    }

    public int getCount() {
        return count;
    }

    public int getSumOfPrimes() {
        return sumOfPrimes;
    }
    
    
    
    public static void main(String[] args) {
      
       }
}
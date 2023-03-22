package example.testCollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Vaccination {
	
	 public static class City {
	        private int clinics;
	        private double population;
	        private double number_of_vacinated;

	        public City(int clinics, int population) {
	            this.clinics = clinics;
	            this.population = population;
	            this.number_of_vacinated = population / clinics;
	        }

	        public double getNumberOfVacinated() {
	            return number_of_vacinated;
	        }

	        @Override
	        public String toString() {
	            return String.format("City{clinics='%s', population=%f, number_of_vacinated=%f}", clinics, population, population/clinics);
	        }
	    }

	    public static void main(String[] args) {
	        List<City> cities = new ArrayList<City>();

	        int n = 3; // number of city
	        int b = 7; // number of clinics

	        City a1 = new City(1, 2);
	        City a2 = new City(1, 42);
	        City a3 = new City(1, 49);

	        // City a1 = new City(1, 2000000);
	        // City a2 = new City(1, 5000000);
	        // City a3 = new City(1, 3000000);
	        // City a4 = new City(1, 7000000);

	        cities.add(a1);
	        cities.add(a2);
	        cities.add(a3);
	        // cities.add(a4);

	        Comparator<City> vacineComparator = Comparator.comparing(City.getNumberOfVacinated);

	        IntStream.range(n, b).forEach(s -> {

	            System.out.println("iterate => " + s);
	            Stream t = cities.stream();
	            cities.stream().sorted(vacineComparator.reversed()).findFirst().map(c -> {
	                c.clinics++;
	                c.number_of_vacinated = Math.ceil(c.population / c.clinics);
	                return c;
	            });

	            t.forEach(System.out::println);
	            System.out.println("==================================================================");
	        });

	        Double maxNum = cities.stream().sorted(vacineComparator.reversed()).findFirst().get().getNumberOfVacinated();
	        System.out.println(" The maximum number of people to be immunized in the largest clinic is : " + maxNum);
	    }


}

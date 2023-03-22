package example.testCollection;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VacnicationProblem {
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



	    public static void main(String[] args) throws IOException {



	        int n = 0; // the number of city

	        int b = 0; // the number of clinic



	        Scanner in = new Scanner(System.in);



	        System.out.println("Enter a number of city and clinics");



	        while (in.hasNextLine()) {

	            String cityAndClinics = in.nextLine();

	            if (cityAndClinics.equals("exit")) {

	                System.exit(0);

	            }

	            List<String> optionStream = Arrays.stream(cityAndClinics.trim().split("\\s+")).map(s -> s.trim()).collect(Collectors.toList());

	            if (1 < optionStream.size() && optionStream.size() < 3) {

	                n = Integer.parseInt(optionStream.size() > 0 ? optionStream.get(0) : "0"); // number of city

	                if (1 <= n && n <= 500000) {



	                } else {

	                    System.out.println("Enter a number of city and clinics");

	                    System.err.println("The number of city should be between 1 and 500000");

	                }



	                b = Integer.parseInt(optionStream.size() > 1 ? optionStream.get(1) : "0"); // number of clinics

	                if (n <= b && b <= 2000000) {



	                } else {

	                    System.out.println("Enter a number of city and clinics");

	                    System.err.println("The number of clinics should be between the number of city and 2000000");

	                }



	                System.out.println("city => " + n);

	                System.out.println("clinics => " + b);

	                break;

	            } else {

	                System.out.println("Enter a number of city and clinics");

	                System.err.println("The format for city and clinic seems to be wrong. For example 3 4, 3 8, 2 4");

	            }

	        }



	        List<City> cities = new ArrayList<>();



	        IntStream.range(0, n).forEach(s -> {

	            System.out.println("Enter a number for the city's population : ");

	            int population = in.nextInt();

	            if ( 1 <= population && population <= 5000000) {

	                cities.add(new City(1, population));

	            } else {

	                System.err.println("the population should be between 1 and 5000000");

	                System.exit(1);

	            }

	        });



	        Comparator<City> vacineComparator = Comparator.comparing(City::getNumberOfVacinated);



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

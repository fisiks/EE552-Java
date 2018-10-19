/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystemdata;
import java.io.*;
import java.util.*;
/**
 *
 * @author dianagalarza and rahularora
 * I pledge my honor that I have abided by the Stevens Honor System.
 */
public class SolarSystem {
	public String name;
	public double mass, diameter, orbits, dist;
	
	
	
	public static void main(String[] args) {
		ArrayList<SolarSystem> planets = new ArrayList<>();
		
		try {
			FileReader fr = new FileReader("solarsystem.dat");
			
			Scanner scanner = new Scanner(fr);

			String nextLine = scanner.nextLine();
			String regex = "(\\s)+";

			String[] header = nextLine.split(regex);

			for(int i = 0; i < header.length; i++){
				 				 				
				 if(header[i].equals("SUN") || header[i].equals("VENUS") || header[i].equals("EARTH") || header[i].equals("MOON")){
					 
						 fr = new FileReader("solarsystem.dat");
						
						 scanner = new Scanner(fr);
						
					 SolarSystem ss = new SolarSystem();
					 ss.name = header[i];
					 
					 while (scanner.hasNext()) {

						 String[] row = scanner.nextLine().split(regex);
						 
						 if(row[0].equals("Mass(kg)")){
							 
							 if(row[i].contains(",")){
								 row[i] = row[i].replace(",", "");
							 }
							 
							 ss.mass = Double.valueOf(row[i]);
							 
						 }else if(row[0].equals("Diam(m)")){
							
							 if(row[i].contains(",")){
								 row[i] = row[i].replace(",", "");
							 }
							 
							 ss.diameter = Double.valueOf(row[i]);
							 
						 }else if(row[0].equals("Orbits")){
							 
							 if(row[i].contains(",")){
								 row[i] = row[i].replace(",", "");
							 }
							 ss.orbits = Double.valueOf(row[i]);
						 }else if(row[0].equals("")){
							 
							 if(row[i].contains(",")){
								 row[i] = row[i].replace(",", "");
							 }
							 ss.orbits = Double.valueOf(row[i]);
						 }														
					 }
					 planets.add(ss);
				 }
			}
			
  
			for(int x = 0; x < planets.size(); x++){
				
				System.out.println(planets.get(x).name);
				System.out.println(planets.get(x).mass);
				System.out.println(planets.get(x).diameter);
				System.out.println(planets.get(x).orbits);
//                                System.out.println(planets.get(x).dist);
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

package com.xworkz.equals.runner;

import com.xworkz.equals.object_method.FoodObject;

public class FoodRunner {

	public static void main(String[] args) {

		

				FoodObject	food = new FoodObject();
				food.setName("Kashmiri Paluao");
				food.setPrice(299.1f);
				food.setQuantity(1);
				food.setQuality("Delicious");
//				food.toString();
//				food.hashCode();
//				System.out.println(food.toString());
//				System.out.println(food.hashCode());

				FoodObject food1 = new FoodObject();
				food1.setName("Fried Rice");
				food1.setPrice(199.2f);
				food1.setQuantity(1);
				food1.setQuality("Tasty");

				if (food == food1) {
					System.out.println("both are pointing to same memory");
				}
				
				boolean same = food.equals(food1);
				{
					System.out.println(same);
				}
			}


	}



/*
 * Copyright (C) 2021 Jiri Skoda <jiri.skoda@student.upce.cz>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package cz.uhk.fim.skodaji1.kalgd.hw02;

import java.util.Scanner;

/**
 * Class representing second exercise of second homework
 * @author Jiri Skoda <skodaji1@uhk.cz>
 */
public class ex02
{

    /**
     * Main function of program which runs second exercise
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] array = GenerateRandomArray(8, 16);
        PrintArray(array);
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 == 1)
            {
                for (int j = (array.length - 2); j > i; j--)
                {
                    array[j + 1] = array[j];
                }
                array[i + 1] = 1;
                i++;
            }
        }
        PrintArray(array);
    }
    
    /**
     * Creates new random array
     * @param items Count of items in array
     * @param length Length of array
     * @return Array with random items
     */
    public static int[] GenerateRandomArray(int items, int length)
    {
        int[] reti = new int[length];
        for (int i = 0; i < items; i++)
        {
            reti[i] = java.util.concurrent.ThreadLocalRandom.current().nextInt(1, 20);
        }
        return reti;
    }
    
    /**
     * Prints array to standard output
     * @param array Array which will be printed
     */
    public static void PrintArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
            if (i < (array.length - 1))
            {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
}
   
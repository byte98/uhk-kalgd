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
 * Class representing fourth exercise of second homework
 * @author Jiri Skoda <skodaji1@uhk.cz>
 */
public class ex04
{

    /**
     * Main function of program which runs fourth exercise
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] a = {4, 7, 8, 4, 5, 2};
        int[] b = new int[a.length];
        int n = 6;
        int m = -1;
        for (int i = 0; i < n; i++)
        {
            if (a[i] % 2 == 1)
            {
                m = m + 1;
                b[m] = a[i];
            }
        }
        PrintArray(a);
        PrintArray(b);
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
   
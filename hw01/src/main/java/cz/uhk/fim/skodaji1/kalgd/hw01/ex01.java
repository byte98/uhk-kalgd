/*
 * Copyright (C) 2021 Jiri Skoda <skodaji1@uhk.cz>
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
package cz.uhk.fim.skodaji1.kalgd.hw01;

import java.util.Scanner;

/**
 * Class representing first exercise of first homework
 * @author Jiri Skoda <skodaji1@uhk.cz>
 */
public class ex01 {

    /**
     * Main function of program which runs first exercise
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, maxPos = -1, minPos = -1;
        int input;
        for (int i = 0; i < 10; i++) // In assignment, there is 230 items, but 10 is much simpler for testing
        {
            input = scanner.nextInt();
            if (input > max)
            {
                max = input;
                maxPos = i;
            }
            if (input < min || input == min)
            {
                min = input;
                minPos = i;
            }
        }
        System.out.printf("Maximum: %d (prvni vyskyt: %d); minimum: %d (posledni vyskyt: %d)\n", max, maxPos, min, minPos);
    }
    
}

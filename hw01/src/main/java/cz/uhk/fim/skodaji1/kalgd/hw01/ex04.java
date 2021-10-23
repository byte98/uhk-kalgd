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
 * Class representing fourth exercise of first homework
 * @author Jiri Skoda <skodaji1@uhk.cz>
 */
public class ex04 {

    /**
     * Main function of program which runs fourth exercise
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int cislo;
        int pocet = 0;
        int i;
        for (i = 1; i <= p; i = i + 1)
        {
            cislo = input.nextInt();
            if (cislo % 2 == 1)
            {
                pocet = pocet + 1;
                if (pocet == 5)
                {
                    System.out.println(cislo);
                    pocet = 0;
                }
            }
        }
    }   
    
}

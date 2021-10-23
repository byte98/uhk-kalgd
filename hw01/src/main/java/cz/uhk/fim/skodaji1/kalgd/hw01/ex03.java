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
package cz.uhk.fim.skodaji1.kalgd.hw01;

import java.util.Scanner;

/**
 * Class representing third exercise of first homework
 * @author Jiri Skoda <skodaji1@uhk.cz>
 */
public class ex03 {

    /**
     * Main function of program which runs third exercise
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int o = 4;
        int p = 5;
        int q = 5;
        for (int i = 1; i <= 5; i = i + 1)
        {
            o = o + 1;
            p = p + 2;
            q = q + o;
            System.out.printf("i: %d, o: %d, p: %d, q: %d\n", i, o, p, q);
        }
        System.out.printf("o: %d, p: %d, q: %d\n", o, p, q);
        
    }   
    
}

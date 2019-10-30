/* 
 * Copyright 2019 Mario Merlos Abella <mario.merlos.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Mario Merlos Abella <mario.merlos.alum@iescamp.es>
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        //variables & Constantes
        final int MAX = 10;
        final int MIN = 0;
        int numero;

        //Estado inicial
        numero = MIN;

        //Inicio bucle
        do {
            boolean nota = RND.nextBoolean();
            numero++;
            System.out.printf("Respuesta %02d ...: %b%n", numero, nota);

        } while (numero < MAX);
        System.out.println("END");
    }
}

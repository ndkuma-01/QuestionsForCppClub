package Hard;

/*
 * Oh no! You are currently stranded on Mount Imgonnadie!
 * Luckily you have a way of sending out a distress signal, but drats! It's asking for an email verification code
 * Even luckier, you have a CPU with you, capable of reciving the code, but you don't have a monitor.
 * Luckiest, you do have a Cathode-Ray Tube Screen which will sync up to the clock cycles of the cpu
 * 
 * Start by figuring out the signal being sent by the CPU. The CPU has a single register, X, which starts with the value 1. 
 * It supports only two instructions:
 * addx V takes two cycles to complete. After two cycles, the X register is increased by the value V. (V can be negative.)
 * noop takes one cycle to complete. It has no other effect.
 * The CPU uses these instructions in a program (your input) to, somehow, tell the screen what to draw.
 * 
 * Consider the following small program:

 * noop
 * addx 3
 * addx -5
 * 
 * Execution of this program proceeds as follows:
 * At the start of the first cycle, the noop instruction begins execution. During the first cycle, X is 1. After the first cycle, the noop instruction finishes execution, doing nothing.
 * At the start of the second cycle, the addx 3 instruction begins execution. During the second cycle, X is still 1.
 * During the third cycle, X is still 1. After the third cycle, the addx 3 instruction finishes execution, setting X to 4.
 * At the start of the fourth cycle, the addx -5 instruction begins execution. During the fourth cycle, X is still 4.
 * During the fifth cycle, X is still 4. After the fifth cycle, the addx -5 instruction finishes execution, setting X to -1.
 */

public class CRT {
    
    public static void main(String[] args) {
        if (part1() == 16060)
            System.out.println("Part 1 Correct! \n\n");
        else
            System.out.println("Part 1 incorrect. \n\n");

        part2();

        System.out.println("If you see the letters \"BACEKLHF\", part 2 is correct");
    }

    /*
     * Maybe you can learn something by looking at the value of the X register throughout execution. 
     * For now, consider the signal strength (the cycle number multiplied by the value of the X register) 
     * during the 20th cycle and every 40 cycles after that 
     * (that is, during the 20th, 60th, 100th, 140th, 180th, and 220th cycles).
     * Find the signal strength during the 20th, 60th, 100th, 140th, 180th, and 220th cycles. 
     * return the sum of these six signal strengths from the input found in the txt file
     */
    public static int part1() {

        return 0;
    }

    /*
     * It turns out the X register represents the horizontal position of a 3 pixel wide sprite on the CRT! (X is the center of the 3)
     * The CRT happens to be 40 pixels wide and 6 pixels tall. At the end of one row, it wraps to the next row
     * by carefully timing the CPU instructions and the CRT drawing operations, 
     * you should be able to determine whether the sprite is visible the instant each pixel is drawn. 
     * If the sprite is positioned such that one of its three pixels is the pixel currently being drawn,
     * the screen produces a lit pixel (#); otherwise, the screen leaves the pixel dark (.).
     * For an example see the bottom of this file
     * Allow the program to run to completion and the 8 capital letters displayed will be the email verification code you need
     */
    public static void part2() {

    }
}

/*
 * Consider:
 * addx 15
 * addx -11
 * addx 6
 * addx -3
 * addx 5
 * addx -1
 * addx -8
 * addx 13
 * addx 4
 * noop
 * addx -1
 * 
 * Sprite position: ###.....................................

 * Start cycle   1: begin executing addx 15
 * During cycle  1: CRT draws pixel in position 0
 * Current CRT row: #

 * During cycle  2: CRT draws pixel in position 1
 * Current CRT row: ##
 * End of cycle  2: finish executing addx 15 (Register X is now 16)
 * Sprite position: ...............###......................

 * Start cycle   3: begin executing addx -11
 * During cycle  3: CRT draws pixel in position 2
 * Current CRT row: ##.

 * During cycle  4: CRT draws pixel in position 3
 * Current CRT row: ##..
 * End of cycle  4: finish executing addx -11 (Register X is now 5)
 * Sprite position: ....###.................................

 * Start cycle   5: begin executing addx 6
 * During cycle  5: CRT draws pixel in position 4
 * Current CRT row: ##..#

 * During cycle  6: CRT draws pixel in position 5
 * Current CRT row: ##..##
 * End of cycle  6: finish executing addx 6 (Register X is now 11)
 * Sprite position: ..........###...........................

 * Start cycle   7: begin executing addx -3
 * During cycle  7: CRT draws pixel in position 6
 * Current CRT row: ##..##.

 * During cycle  8: CRT draws pixel in position 7
 * Current CRT row: ##..##..
 * End of cycle  8: finish executing addx -3 (Register X is now 8)
 * Sprite position: .......###..............................

 * Start cycle   9: begin executing addx 5
 * During cycle  9: CRT draws pixel in position 8
 * Current CRT row: ##..##..#

 * During cycle 10: CRT draws pixel in position 9
 * Current CRT row: ##..##..##
 * End of cycle 10: finish executing addx 5 (Register X is now 13)
 * Sprite position: ............###.........................

 * Start cycle  11: begin executing addx -1
 * During cycle 11: CRT draws pixel in position 10
 * Current CRT row: ##..##..##.

 * During cycle 12: CRT draws pixel in position 11
 * Current CRT row: ##..##..##..
 * End of cycle 12: finish executing addx -1 (Register X is now 12)
 * Sprite position: ...........###..........................

 * Start cycle  13: begin executing addx -8
 * During cycle 13: CRT draws pixel in position 12
 * Current CRT row: ##..##..##..#

 * During cycle 14: CRT draws pixel in position 13
 * Current CRT row: ##..##..##..##
 * End of cycle 14: finish executing addx -8 (Register X is now 4)
 * Sprite position: ...###..................................

 * Start cycle  15: begin executing addx 13
 * During cycle 15: CRT draws pixel in position 14
 * Current CRT row: ##..##..##..##.

 * During cycle 16: CRT draws pixel in position 15
 * Current CRT row: ##..##..##..##..
 * End of cycle 16: finish executing addx 13 (Register X is now 17)
 * Sprite position: ................###.....................

 * Start cycle  17: begin executing addx 4
 * During cycle 17: CRT draws pixel in position 16
 * Current CRT row: ##..##..##..##..#

 * During cycle 18: CRT draws pixel in position 17
 * Current CRT row: ##..##..##..##..##
 * End of cycle 18: finish executing addx 4 (Register X is now 21)
 * Sprite position: ....................###.................

 * Start cycle  19: begin executing noop
 * During cycle 19: CRT draws pixel in position 18
 * Current CRT row: ##..##..##..##..##.
 * End of cycle 19: finish executing noop

 * Start cycle  20: begin executing addx -1
 * During cycle 20: CRT draws pixel in position 19
 * Current CRT row: ##..##..##..##..##..

 * During cycle 21: CRT draws pixel in position 20
 * Current CRT row: ##..##..##..##..##..#
 * End of cycle 21: finish executing addx -1 (Register X is now 20)
 * Sprite position: ...................###..................
 */

package book_shild_beginners.charter03;
// Применение двумерного массива
public class DuoArray {
    public static void main (String [] args) {
        int[][] mArr = new int[10][];
        int i, j, k = 0;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < i + 1; j++) {
                mArr[i] = new int[i + 1];
                mArr[i][j] = k;
                k++;
                System.out.print("[" + i + j + "] " + mArr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
/*
--------------------------------------------
[00] 0
[10] 1	[11] 2
[20] 3	[21] 4	[22] 5
[30] 6	[31] 7	[32] 8	[33] 9
[40] 10	[41] 11	[42] 12	[43] 13	[44] 14
[50] 15	[51] 16	[52] 17	[53] 18	[54] 19	[55] 20
[60] 21	[61] 22	[62] 23	[63] 24	[64] 25	[65] 26	[66] 27
[70] 28	[71] 29	[72] 30	[73] 31	[74] 32	[75] 33	[76] 34	[77] 35
[80] 36	[81] 37	[82] 38	[83] 39	[84] 40	[85] 41	[86] 42	[87] 43	[88] 44
[90] 45	[91] 46	[92] 47	[93] 48	[94] 49	[95] 50	[96] 51	[97] 52	[98] 53	[99] 54
 */


public class main {
    public static void main(String[] args) {
        computer[] computers = new computer[5];
        computer computer1 = new computer(2, 15, 1);
        computer computer2 = new computer(4, 14, 2);
        computer computer3 = new computer(6, 12, 2);
        computer computer4 = new computer(8, 14, 3);
        computer computer5 = new computer(16, 17, 3);
        computers[0] = computer1;
        computers[1] = computer2;
        computers[2] = computer3;
        computers[3] = computer4;
        computers[4] = computer5;
        for (int i = 0; i < computers.length; i++) {
            System.out.println((i + 1) + "." + "computer have " + computers[i].getCpu() + " cpu " + computers[i].getRam() + " ram " + computers[i].getScreen() + " screen ");

        }
        System.out.println("-----------");
        int i = 0;
        while (i<computers.length)
        {if (computers[i].getScreen() < 13) {
            i++;
        }
        else {
            System.out.println(i + 1 + "." + " computer have more than 13 screen");
            i++;


        }




    }
    }

}

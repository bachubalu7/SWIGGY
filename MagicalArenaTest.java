class MagicalArenaTest{
    public static void main(String[] args){
        //mainTest();
        testCheckLeastHealth_Player1();
        testCheckLeastHealth_Player2();
        testGetPlayerInput();
    }
    public static void testCheckLeastHealth_Player1(){
        Player weakPlayer = new Player("weakPlayer", 100, 10, 33);
        Player strongPlayer = new Player("strongPlayer", 120, 8, 4);
        Player leastHealthPlayer = MagicalArena.checkLeastHealthPlayer(weakPlayer, strongPlayer);
        if (leastHealthPlayer == weakPlayer){
            System.out.println("checkLeastHealthPlayer test passed");
        }
        else{
            System.out.println("checkLeastHealthPlayer test failed");
        }
    }

    public static void testCheckLeastHealth_Player2(){
        Player weakPlayer = new Player("weakPlayer", 100, 10, 33);
        Player strongPlayer = new Player("strongPlayer", 120, 8, 4);
        Player leastHealthPlayer = MagicalArena.checkLeastHealthPlayer(strongPlayer, weakPlayer);
        if (leastHealthPlayer == weakPlayer){
            System.out.println("checkLeastHealthPlayer test passed");
        }
        else{
            System.out.println("checkLeastHealthPlayer test failed");
        }
    }

    public static void testGetPlayerInput(){
        ConsoleInputReaderMock scannermock = new ConsoleInputReaderMock();
        Player actualPlayer = MagicalArena.getPlayerInput(scannermock);
        Player mockPlayer = new Player("A", 1, 1, 1);
        if(actualPlayer.getName() == mockPlayer.getName() && actualPlayer.getHealth() == mockPlayer.getHealth()){
            System.out.println("getPlayerInput test passed");
        }
        else{
            System.out.println("getPlayerInput test failed");
        }
    }
}
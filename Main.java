class Main {
  public static void main(String[] args) {
    int wysokosc;
    wysokosc = 5;
    for(int i = 0; i<wysokosc; i+=1){
      for(int j = 0; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
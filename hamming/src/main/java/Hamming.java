class Hamming {
    int distance;

    Hamming(String leftStrand, String rightStrand) {
      if (leftStrand.length() != rightStrand.length()) 
        throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
      this.distance = 0;
      for (int idx = 0; idx < leftStrand.length(); idx++)
        if (leftStrand.charAt(idx) != rightStrand.charAt(idx)) this.distance++;
    }

    int getHammingDistance() {
      return this.distance;
    }

}

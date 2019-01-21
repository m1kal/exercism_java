import java.util.ArrayList;

class Allergies{
  int  allergies;

  Allergies(int encoded) {
    allergies = encoded;
  }

  boolean isAllergicTo(Allergen allergen){
    return ((allergen.getScore() & allergies) > 0);
  }

  ArrayList<Allergen> getList() {
    ArrayList<Allergen> list = new ArrayList<>();
    for (Allergen a : Allergen.values())
      if (isAllergicTo(a))
        list.add(a);
    return list;
  }
}


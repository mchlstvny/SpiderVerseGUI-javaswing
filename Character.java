// public class Character {
//     public String name;
//     public String imagePath;
//     public String description;

//     public Character(String name, String imagePath, String description) {
//         this.name = name;
//         this.imagePath = imagePath;
//         this.description = description;
//     }
// }

public class Character {
    public String name;             // Hero name (e.g., "Miles Morales")
    public String realName;         // Real name (e.g., "Miles Gonzalo Morales")
    public String imagePath;        // Masked image (used in the grid)
    public String unmaskedImagePath; // Unmasked portrait image
    public String description;      // Bio or short description
    public int age;

    public Character(String name, String realName, String imagePath, String unmaskedImagePath, String description, int age) {
        this.name = name;
        this.realName = realName;
        this.imagePath = imagePath;
        this.unmaskedImagePath = unmaskedImagePath;
        this.description = description;
        this.age = age;
    }
}


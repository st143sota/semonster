public class Monster {
  String name;
  int rare; // 0:common, 2:uncommon, 4:rare

  Monster() {
    Random random = new Random();
    int monsterIndex = random.nextInt(5);
    this.name = this.summonMonster(monsterIndex);
    this.rare = this.setRarity(this.name);
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  int setRarity(String monsterName) {
    switch (monsterName) {
      case "スライム":
        return 4;
      case "サハギン":
      case "シーサーペント":
        return 0;
      default:
        return 2;
    }
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]";
  }
}


void main() {
List<String> brands = ["Ford", "Porsche", "Ferrari", "Buggati", "Mitsubishi"];

  List<int> averageprice = [10000, 210000, 135000, 400000, 1800000, 15000];
  
 for(int i =0; i < brands.length;i++){
   print("${brands[i]} cars has an average price of  ${averageprice[i]} dollars");
 }
  
}

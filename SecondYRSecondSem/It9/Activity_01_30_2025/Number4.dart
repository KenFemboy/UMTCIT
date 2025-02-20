void main(){
  int grade = 80;
  if(grade >= 95){
    print("${grade is equivalent to A}");
  }
  else if(grade >= 90){
    print("${grade is equivalent to B}");
  }
  else if(grade >= 85){
    print("${grade is equivalent to C}");
  }  
  else if(grade >= 80){
    print("${grade is equivalent to D}");
  }  
  else if(grade >= 75){
    print("${grade is equivalent to F}");
  }  
  else{
    print("You Failed");
  }
}
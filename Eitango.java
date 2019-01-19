import java.io.*;

public class Eitango {
public static void main(String[] args) throws IOException {
BufferedReader br=
new BufferedReader(new InputStreamReader(System.in));
String[] Q=new String[11];

Q[1]="A: Can I borrow your camera ?\n"
+"B: Sure, but it doesn't ( ) very well."
+"It's very old.\n"
+"1,work 2,play 3,speak 4,live";

Q[2]="A: Have you finished your homework, Ken ?\n"
+"B: No. I'm ( ) doing it.\n"
+"1,often 2,long 3,still 4,fun ";

Q[3]="A: My name is Christopher, but my friends ( ) me Chris. \n"
+"1,say 2,call 3,speak 4,tell " ;

Q[4]="A:Kate really ( ) herself last year.\n"
+"She wants to go there again this year.\n"
+"1,time 2,enjoyed 3,put 4,passed";

Q[5]="A: Excuse me. I ask you a ( ) ?\n"
+"B: Sure.\n"
+"1,sorry 2,favor 3,please 4,door";

Q[6]="A: Hello. This is Sam. Can I speak to Lisa ?\n"
+"B: ( ). She is out now.\n"
+"1,Sorry 2,Thanks 3,Great 4,OK";

Q[7]="A: I want be a singer. How ( ) you ?\n"
+"1,much 2,many 3,about 4,often";

Q[8]="A: Are you free on Sunday ? We'll have a party.\n"
+"B: Yes. What ( ) ?\n"
+"A: At noon.\n"
+"1,time 2,kind 3,party 4,up";

Q[9]="A: We go to school ( ) Monday to Friday. \n"
+"1,too 2,on 3,in 4,from";

Q[10]="A:What ( ) of music do you like the best ?\n"
+"B: I like rock music the best.\n"
+"1,kind 2,time 3,subject 4,place";

int[] V={ 0, 1, 3, 2, 2, 2, 1, 2, 1, 4, 1}; // 解答リスト
int correct=0,error=0,total=10;

for (int i=1; i<=10; i++) {
System.out.println(Q[i]); // 問題の表示
System.out.print("1～4 の番号を入れて下さい=>");
int ans=Integer.parseInt(br.readLine()); // 回答の入力
if (ans==V[i])correct++; // 正解の場合
else error++; // 不正解の場合

System.out.println();
}
System.out.println("10 問中 "+correct+"問正解でした.");

int percent = correct * 100 / total;
System.out.println("正答率は"+ percent + "%でした.");

System.out.println("ちなみに間違えた問題番号は"+ V[i] + "番でした.");

}
}

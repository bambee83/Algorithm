import java.io.*;
import java.util.*;

public class Main {
        static class Member {
            int age;       // 회원의 나이
            String name;   // 회원의 이름
            int order;     // 가입 순서

            public Member(int age, String name, int order) {
                this.age = age;
                this.name = name;
                this.order = order;
            }
        }

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int N = Integer.parseInt(br.readLine());
            
            Member[] members = new Member[N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int age = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                members[i] = new Member(age, name, i); // i는 가입 순서를 나타냄
            }

            // 정렬: 나이 오름차순, 나이가 같으면 가입 순서 유지
            Arrays.sort(members, new Comparator<Member>() {
                @Override
                public int compare(Member m1, Member m2) {
                    if (m1.age != m2.age) {
                        return Integer.compare(m1.age, m2.age); // 나이 기준 오름차순
                    }
                    return Integer.compare(m1.order, m2.order); // 가입 순서 기준
                }
            });
            
            for (Member member : members) {
                bw.write(member.age + " " + member.name + "\n");
            }
            bw.flush();
            bw.close();
    }
}
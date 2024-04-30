package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class App {
    void run() {
        System.out.println("== 명언 앱 ==");

        int lastQuotationId = 0;

        List<Quotation> quotations = new ArrayList<>();

        while(true){
            System.out.println("명령) ");

            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine();

            if(cmd.equals("종료")) {
                break;
            }
            else if(cmd.equals("등록")){
                System.out.print("명언 : ");
                String content = scanner.nextLine();

                System.out.print("작가 : ");
                String authorName = scanner.nextLine();

                lastQuotationId++;

                int id = lastQuotationId;

                Quotation quotation = new Quotation(id, content, authorName);
                quotations.add(quotation);

                System.out.printf("%d번 명언이 등록되었습니다.\n", lastQuotationId);
            }
            else if(cmd.equals("목록")){
                System.out.println("총 갯수 : " + quotations.size());
            }
        }
    }
}

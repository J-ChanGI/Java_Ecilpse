package Day_21_04_22_pkg;

import java.util.*;

public class ProductService {
	Scanner sc = new Scanner(System.in);
	
	void goodslist(List<ProductDTO> goodslist) { // 상품전체조회
		for(int i=0; i<goodslist.size(); i++) {
			System.out.println(goodslist.get(i).toString());
		}
	}
	
	List<ProductDTO> update (List<ProductDTO> goodslist){ //상품정보수정
		System.out.print("상품번호 : ");
		int pNumber = sc.nextInt();
		System.out.print("상품명 : ");
		String pName = sc.next();
		for(int i=0; i<goodslist.size(); i++) {
			if(pNumber == goodslist.get(i).getpNumber() && 
					pName.equals(goodslist.get(i).getpName())) {
				
				System.out.print("가격수정 : "); 
				int pPrice = sc.nextInt();
				goodslist.get(i).setpPrice(pPrice);
				
				System.out.print("재고수정 : ");
				int pStock = sc.nextInt();
				goodslist.get(i).setpStock(pStock);
			}
		}
		
		
		
		return goodslist;
	}
	
	List<ProductDTO> pDelete (List<ProductDTO> goodslist){ // 상품삭제
		System.out.print("상품번호 :");
		int pNumber =sc.nextInt();
		for(int i=0; i<goodslist.size(); i++) {
		  	if(pNumber == goodslist.get(i).getpNumber()) {
				
		  		goodslist.remove(i);
			}
		}
		
		
		return goodslist;
	}
	
	
}

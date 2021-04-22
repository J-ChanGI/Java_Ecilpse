package Day_21_04_22_pkg;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ProductService ps = new ProductService();
		List<ProductDTO> goodslist = new ArrayList<ProductDTO>();
		
		boolean run = true ;
		while (run) {
			System.out.println("1. 상품등록 | 2. 전체상품조회 | 3. 상품정보수정 | 4. 상품삭제 ");
			System.out.print("선택> ");
			int Seclect = sc.nextInt();
			
			
			
			switch(Seclect) {
				
			case 1: // 상품등록 
				ProductDTO pr = new ProductDTO();
				
				System.out.print("상품명 : ");
				String pName = sc.next();
				System.out.print("상품가격 : ");
				int pPrice = sc.nextInt();
				System.out.print("재고량 : ");
				int pStock = sc.nextInt();
				int pNumber = goodslist.size()+1;
				
				pr.setpName(pName);
				pr.setpPrice(pPrice);
				pr.setpStock(pStock);
				pr.setpNumber(pNumber);
				
				goodslist.add(pr);
				
				
				break;
			case 2: // 전체상품조회 
				
				 ps.goodslist(goodslist);
				
				break;
			case 3: // 상품정보수정
				
				ps.update(goodslist);
				
				break;
			case 4: // 상품삭제
				
				ps.pDelete(goodslist);
				
				break;
			
			}
		}	
			
	}

}

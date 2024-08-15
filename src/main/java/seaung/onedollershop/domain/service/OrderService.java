package seaung.onedollershop.domain.service;

import seaung.onedollershop.domain.entity.Member;
import seaung.onedollershop.domain.entity.Order;

public interface OrderService {
    Order autoOrder(Member member); // 자동 주문
}

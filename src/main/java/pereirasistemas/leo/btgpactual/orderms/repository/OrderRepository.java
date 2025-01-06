package pereirasistemas.leo.btgpactual.orderms.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import pereirasistemas.leo.btgpactual.orderms.entity.OrderEntity;

public interface OrderRepository extends MongoRepository<OrderEntity,Long> {
    Page<OrderEntity>findAllByCustomerId(Long customerId, PageRequest pageRequest);
}

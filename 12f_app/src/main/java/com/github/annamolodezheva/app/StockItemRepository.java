package com.github.annamolodezheva.app;

import com.github.annamolodezheva.app.domain.model.ItemType;
import com.github.annamolodezheva.app.domain.model.StockItem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StockItemRepository extends CrudRepository<StockItem, Long> {
    List<StockItem> findByType(ItemType type);
}

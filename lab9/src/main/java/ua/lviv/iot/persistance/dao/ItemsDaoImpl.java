package ua.lviv.iot.persistance.dao;

import ua.lviv.iot.item.ShopItem;

import javax.annotation.Resource;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import java.io.Serializable;

@Named
@Dependent
public class ItemsDaoImpl extends AbstractDao<ShopItem> implements ItemDao, Serializable {

    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<ShopItem> getEntityClass() {
        return ShopItem.class;
    }

    @Resource
    private UserTransaction userTransaction;

}
package com.zgld.mall.beans;

/**
 * HishopPurchaseGifts entity. @author MyEclipse Persistence Tools
 */
public class HishopPurchaseGifts extends AbstractHishopPurchaseGifts implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopPurchaseGifts() {
	}

	/** full constructor */
	public HishopPurchaseGifts(HishopPromotions hishopPromotions,
			Integer buyQuantity, Integer giveQuantity) {
		super(hishopPromotions, buyQuantity, giveQuantity);
	}

}

package com.handpay.obm.gascard.common.utils;

public class GascardUtils {
	
	public static final String ZSH_CARDPATEL_13 = "^[0-9]{13}$";
	
	public static final String ZSH_CARDPATEL_19 = "^100011[0-9]{13}$";
	
	public static final String ZSY_CARDPATEL = "^9[0-9]{15}$";
	
	/**
	 * 根据加油卡号判断是否是中石化，除去开头100011
	 */
	public static boolean isZshWith13(String gasCard){
		if(gasCard.length()==13 && gasCard.matches(ZSH_CARDPATEL_13)){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 根据加油卡号判断是否是中石化，除去开头100011
	 */
	public static boolean isZshWith19(String gasCard){
		if(gasCard.length()==19 && gasCard.matches(ZSH_CARDPATEL_19)){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 根据加油卡号判断是否是中石油
	 */
	public static boolean isZsy(String gasCard){
		if(gasCard.length()==16 && gasCard.matches(ZSY_CARDPATEL)){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 判断油卡是否是任意充
	 * @param cardId
	 * @return
	 */
	public static boolean isArbitrary(String cardId){
		if("64127500".equals(cardId) || "64349102".equals(cardId)){
			return true;
		}else{
			return false;
		}
	}

}

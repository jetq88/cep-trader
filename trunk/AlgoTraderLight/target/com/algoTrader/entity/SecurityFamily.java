// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package com.algoTrader.entity;

/**
 * 
 */
public abstract class SecurityFamily
        extends com.algoTrader.BaseObject
        implements java.io.Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long	serialVersionUID	= -4354084820769876375L;
	
	private java.lang.String	name;
	
	/**
     * 
     */
	public java.lang.String getName() {
		return name;
	}
	
	public void setName(final java.lang.String name) {
		this.name = name;
	}
	
	private com.algoTrader.enumeration.Market	market;
	
	/**
     * 
     */
	public com.algoTrader.enumeration.Market getMarket() {
		return market;
	}
	
	public void setMarket(final com.algoTrader.enumeration.Market market) {
		this.market = market;
	}
	
	private com.algoTrader.enumeration.Currency	currency;
	
	/**
     * 
     */
	public com.algoTrader.enumeration.Currency getCurrency() {
		return currency;
	}
	
	public void setCurrency(final com.algoTrader.enumeration.Currency currency) {
		this.currency = currency;
	}
	
	private int	contractSize;
	
	/**
     * 
     */
	public int getContractSize() {
		return contractSize;
	}
	
	public void setContractSize(final int contractSize) {
		this.contractSize = contractSize;
	}
	
	private double	tickSize;
	
	/**
     * 
     */
	public double getTickSize() {
		return tickSize;
	}
	
	public void setTickSize(final double tickSize) {
		this.tickSize = tickSize;
	}
	
	private java.math.BigDecimal	commission;
	
	/**
     * 
     */
	public java.math.BigDecimal getCommission() {
		return commission;
	}
	
	public void setCommission(final java.math.BigDecimal commission) {
		this.commission = commission;
	}
	
	private java.util.Date	marketOpen;
	
	/**
     * 
     */
	public java.util.Date getMarketOpen() {
		return marketOpen;
	}
	
	public void setMarketOpen(final java.util.Date marketOpen) {
		this.marketOpen = marketOpen;
	}
	
	private java.util.Date	marketClose;
	
	/**
     * 
     */
	public java.util.Date getMarketClose() {
		return marketClose;
	}
	
	public void setMarketClose(final java.util.Date marketClose) {
		this.marketClose = marketClose;
	}
	
	private boolean	tradeable;
	
	/**
     * 
     */
	public boolean isTradeable() {
		return tradeable;
	}
	
	public void setTradeable(final boolean tradeable) {
		this.tradeable = tradeable;
	}
	
	private boolean	expirable;
	
	/**
     * 
     */
	public boolean isExpirable() {
		return expirable;
	}
	
	public void setExpirable(final boolean expirable) {
		this.expirable = expirable;
	}
	
	private int	id;
	
	/**
     * 
     */
	public int getId() {
		return id;
	}
	
	public void setId(final int id) {
		this.id = id;
	}
	
	private java.util.Collection	securities	= new java.util.HashSet();
	
	/**
     * 
     */
	public java.util.Collection getSecurities() {
		return securities;
	}
	
	public void setSecurities(final java.util.Collection securities) {
		this.securities = securities;
	}
	
	private com.algoTrader.entity.Security	underlaying;
	
	/**
     * 
     */
	public com.algoTrader.entity.Security getUnderlaying() {
		return underlaying;
	}
	
	public void
	        setUnderlaying(final com.algoTrader.entity.Security underlaying) {
		this.underlaying = underlaying;
	}
	
	/**
	 * Returns <code>true</code> if the argument is an SecurityFamily instance
	 * and all identifiers for this entity
	 * equal the identifiers of the argument entity. Returns <code>false</code>
	 * otherwise.
	 */
	@Override
	public boolean equals(final Object object) {
		if (this == object) { return true; }
		if (!(object instanceof SecurityFamily)) { return false; }
		final SecurityFamily that = (SecurityFamily) object;
		if (id != that.getId()) { return false; }
		return true;
	}
	
	/**
	 * Returns a hash code based on this entity's identifiers.
	 */
	@Override
	public int hashCode() {
		int hashCode = 0;
		hashCode = 29 * hashCode + id;
		
		return hashCode;
	}
	
	/**
	 * Constructs new instances of {@link com.algoTrader.entity.SecurityFamily}.
	 */
	public static final class Factory {
		/**
		 * Constructs a new instance of
		 * {@link com.algoTrader.entity.SecurityFamily}.
		 */
		public static com.algoTrader.entity.SecurityFamily newInstance() {
			return new com.algoTrader.entity.SecurityFamilyImpl();
		}
		
		/**
		 * Constructs a new instance of
		 * {@link com.algoTrader.entity.SecurityFamily}, taking all required
		 * and/or
		 * read-only properties as arguments.
		 */
		public static com.algoTrader.entity.SecurityFamily newInstance(
		        final java.lang.String name,
		        final com.algoTrader.enumeration.Market market,
		        final com.algoTrader.enumeration.Currency currency,
		        final int contractSize, final double tickSize,
		        final java.util.Date marketOpen,
		        final java.util.Date marketClose, final boolean tradeable,
		        final boolean expirable) {
			final com.algoTrader.entity.SecurityFamily entity = new com.algoTrader.entity.SecurityFamilyImpl();
			entity.setName(name);
			entity.setMarket(market);
			entity.setCurrency(currency);
			entity.setContractSize(contractSize);
			entity.setTickSize(tickSize);
			entity.setMarketOpen(marketOpen);
			entity.setMarketClose(marketClose);
			entity.setTradeable(tradeable);
			entity.setExpirable(expirable);
			return entity;
		}
		
		/**
		 * Constructs a new instance of
		 * {@link com.algoTrader.entity.SecurityFamily}, taking all possible
		 * properties
		 * (except the identifier(s))as arguments.
		 */
		public static com.algoTrader.entity.SecurityFamily newInstance(
		        final java.lang.String name,
		        final com.algoTrader.enumeration.Market market,
		        final com.algoTrader.enumeration.Currency currency,
		        final int contractSize, final double tickSize,
		        final java.math.BigDecimal commission,
		        final java.util.Date marketOpen,
		        final java.util.Date marketClose, final boolean tradeable,
		        final boolean expirable, final java.util.Collection securities,
		        final com.algoTrader.entity.Security underlaying) {
			final com.algoTrader.entity.SecurityFamily entity = new com.algoTrader.entity.SecurityFamilyImpl();
			entity.setName(name);
			entity.setMarket(market);
			entity.setCurrency(currency);
			entity.setContractSize(contractSize);
			entity.setTickSize(tickSize);
			entity.setCommission(commission);
			entity.setMarketOpen(marketOpen);
			entity.setMarketClose(marketClose);
			entity.setTradeable(tradeable);
			entity.setExpirable(expirable);
			entity.setSecurities(securities);
			entity.setUnderlaying(underlaying);
			return entity;
		}
	}
	
	// HibernateEntity.vsl merge-point
}
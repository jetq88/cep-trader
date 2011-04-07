/**
 * 
 * ExtOrdDlg.java
 * 
 */
package TestJavaClient;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.ib.client.Order;

public class ExtOrdDlg extends JDialog {
	/**
     * 
     */
	private static final long	serialVersionUID	            = 1L;
	public Order	          m_order	                        = new Order();
	public boolean	          m_rc;
	
	private final JTextField	m_tif	                        = new JTextField(
	                                                                    "DAY");
	private final JTextField	m_ocaGroup	                    = new JTextField();
	private final JTextField	m_ocaType	                    = new JTextField(
	                                                                    "0");
	
	private final JTextField	m_account	                    = new JTextField();
	private final JTextField	m_settlingFirm	                = new JTextField();
	private final JTextField	m_clearingAccount	            = new JTextField();
	private final JTextField	m_clearingIntent	            = new JTextField();
	
	private final JTextField	m_openClose	                    = new JTextField(
	                                                                    "O");
	private final JTextField	m_origin	                    = new JTextField(
	                                                                    "1");
	private final JTextField	m_orderRef	                    = new JTextField();
	private final JTextField	m_parentId	                    = new JTextField(
	                                                                    "0");
	private final JTextField	m_transmit	                    = new JTextField(
	                                                                    "1");
	private final JTextField	m_blockOrder	                = new JTextField(
	                                                                    "0");
	private final JTextField	m_sweepToFill	                = new JTextField(
	                                                                    "0");
	private final JTextField	m_displaySize	                = new JTextField(
	                                                                    "0");
	private final JTextField	m_triggerMethod	                = new JTextField(
	                                                                    "0");
	private final JTextField	m_outsideRth	                = new JTextField(
	                                                                    "0");
	private final JTextField	m_hidden	                    = new JTextField(
	                                                                    "0");
	private final JTextField	m_discretionaryAmt	            = new JTextField(
	                                                                    "0");
	private final JTextField	m_shortSaleSlot	                = new JTextField(
	                                                                    "0");
	private final JTextField	m_designatedLocation	        = new JTextField();
	
	private final JTextField	m_rule80A	                    = new JTextField();
	private final JTextField	m_allOrNone	                    = new JTextField();
	private final JTextField	m_overridePercentageConstraints	= new JTextField();
	private final JTextField	m_minQty	                    = new JTextField();
	private final JTextField	m_percentOffset	                = new JTextField();
	private final JTextField	m_eTradeOnly	                = new JTextField();
	private final JTextField	m_firmQuoteOnly	                = new JTextField();
	private final JTextField	m_nbboPriceCap	                = new JTextField();
	private final JTextField	m_auctionStrategy	            = new JTextField(
	                                                                    "0");
	private final JTextField	m_startingPrice	                = new JTextField();
	private final JTextField	m_stockRefPrice	                = new JTextField();
	private final JTextField	m_delta	                        = new JTextField();
	private final JTextField	m_BOXstockRangeLower	        = new JTextField();
	private final JTextField	m_BOXstockRangeUpper	        = new JTextField();
	
	private final JTextField	m_VOLVolatility	                = new JTextField();
	private final JTextField	m_VOLVolatilityType	            = new JTextField();
	private final JTextField	m_VOLDeltaNeutralOrderType	    = new JTextField();
	private final JTextField	m_VOLDeltaNeutralAuxPrice	    = new JTextField();
	private final JTextField	m_VOLContinuousUpdate	        = new JTextField();
	private final JTextField	m_VOLReferencePriceType	        = new JTextField();
	private final JTextField	m_trailStopPrice	            = new JTextField();
	
	private final JTextField	m_scaleInitLevelSize	        = new JTextField();
	private final JTextField	m_scaleSubsLevelSize	        = new JTextField();
	private final JTextField	m_scalePriceIncrement	        = new JTextField();
	
	private final JButton	  m_ok	                            = new JButton(
	                                                                    "OK");
	private final JButton	  m_cancel	                        = new JButton(
	                                                                    "Cancel");
	
	public ExtOrdDlg(final OrderDlg owner) {
		super(owner, true);
		
		setTitle("Sample");
		
		// create extended order attributes panel
		final JPanel extOrderDetailsPanel = new JPanel(new GridLayout(0, 4, 10,
		        10));
		extOrderDetailsPanel.setBorder(BorderFactory
		        .createTitledBorder("Extended Order Info"));
		extOrderDetailsPanel.add(new JLabel("TIF"));
		extOrderDetailsPanel.add(m_tif);
		extOrderDetailsPanel.add(new JLabel("OCA Group"));
		extOrderDetailsPanel.add(m_ocaGroup);
		extOrderDetailsPanel.add(new JLabel("OCA Type"));
		extOrderDetailsPanel.add(m_ocaType);
		
		extOrderDetailsPanel.add(new JLabel("Account"));
		extOrderDetailsPanel.add(m_account);
		extOrderDetailsPanel.add(new JLabel("Settling Firm"));
		extOrderDetailsPanel.add(m_settlingFirm);
		extOrderDetailsPanel.add(new JLabel("Clearing Account"));
		extOrderDetailsPanel.add(m_clearingAccount);
		extOrderDetailsPanel.add(new JLabel("Clearing Intent"));
		extOrderDetailsPanel.add(m_clearingIntent);
		
		extOrderDetailsPanel.add(new JLabel("Open/Close"));
		extOrderDetailsPanel.add(m_openClose);
		extOrderDetailsPanel.add(new JLabel("Origin"));
		extOrderDetailsPanel.add(m_origin);
		extOrderDetailsPanel.add(new JLabel("OrderRef"));
		extOrderDetailsPanel.add(m_orderRef);
		extOrderDetailsPanel.add(new JLabel("Parent Id"));
		extOrderDetailsPanel.add(m_parentId);
		extOrderDetailsPanel.add(new JLabel("Transmit"));
		extOrderDetailsPanel.add(m_transmit);
		extOrderDetailsPanel.add(new JLabel("Block Order"));
		extOrderDetailsPanel.add(m_blockOrder);
		extOrderDetailsPanel.add(new JLabel("Sweep To Fill"));
		extOrderDetailsPanel.add(m_sweepToFill);
		extOrderDetailsPanel.add(new JLabel("Display Size"));
		extOrderDetailsPanel.add(m_displaySize);
		extOrderDetailsPanel.add(new JLabel("Trigger Method"));
		extOrderDetailsPanel.add(m_triggerMethod);
		extOrderDetailsPanel.add(new JLabel("Outside Regular Trading Hours"));
		extOrderDetailsPanel.add(m_outsideRth);
		extOrderDetailsPanel.add(new JLabel("Hidden"));
		extOrderDetailsPanel.add(m_hidden);
		extOrderDetailsPanel.add(new JLabel("Discretionary Amt"));
		extOrderDetailsPanel.add(m_discretionaryAmt);
		extOrderDetailsPanel.add(new JLabel("Trail Stop Price"));
		extOrderDetailsPanel.add(m_trailStopPrice);
		extOrderDetailsPanel.add(new JLabel("Institutional Short Sale Slot"));
		extOrderDetailsPanel.add(m_shortSaleSlot);
		extOrderDetailsPanel
		        .add(new JLabel("Institutional Designated Location"));
		extOrderDetailsPanel.add(m_designatedLocation);
		extOrderDetailsPanel.add(new JLabel("Rule 80 A"));
		extOrderDetailsPanel.add(m_rule80A);
		
		extOrderDetailsPanel.add(new JLabel("All or None"));
		extOrderDetailsPanel.add(m_allOrNone);
		extOrderDetailsPanel.add(new JLabel("Override Percentage Constraints"));
		extOrderDetailsPanel.add(m_overridePercentageConstraints);
		extOrderDetailsPanel.add(new JLabel("Minimum Quantity"));
		extOrderDetailsPanel.add(m_minQty);
		extOrderDetailsPanel.add(new JLabel("Percent Offset"));
		extOrderDetailsPanel.add(m_percentOffset);
		extOrderDetailsPanel.add(new JLabel("Electronic Exchange Only"));
		extOrderDetailsPanel.add(m_eTradeOnly);
		extOrderDetailsPanel.add(new JLabel("Firm Quote Only"));
		extOrderDetailsPanel.add(m_firmQuoteOnly);
		extOrderDetailsPanel.add(new JLabel("NBBO Price Cap"));
		extOrderDetailsPanel.add(m_nbboPriceCap);
		extOrderDetailsPanel.add(new JLabel(""));
		extOrderDetailsPanel.add(new JLabel(""));
		extOrderDetailsPanel.add(new JLabel("BOX: Auction Strategy"));
		extOrderDetailsPanel.add(m_auctionStrategy);
		extOrderDetailsPanel.add(new JLabel("BOX: Starting Price"));
		extOrderDetailsPanel.add(m_startingPrice);
		extOrderDetailsPanel.add(new JLabel("BOX: Stock Reference Price"));
		extOrderDetailsPanel.add(m_stockRefPrice);
		extOrderDetailsPanel.add(new JLabel("BOX: Delta"));
		extOrderDetailsPanel.add(m_delta);
		extOrderDetailsPanel.add(new JLabel("BOX or VOL: Stock Range Lower"));
		extOrderDetailsPanel.add(m_BOXstockRangeLower);
		extOrderDetailsPanel.add(new JLabel("BOX or VOL: Stock Range Upper"));
		extOrderDetailsPanel.add(m_BOXstockRangeUpper);
		
		extOrderDetailsPanel.add(new JLabel("VOL: Volatility"));
		extOrderDetailsPanel.add(m_VOLVolatility);
		extOrderDetailsPanel.add(new JLabel("VOL: Volatility Type (1 or 2)"));
		extOrderDetailsPanel.add(m_VOLVolatilityType);
		extOrderDetailsPanel.add(new JLabel("VOL: Hedge Delta Order Type"));
		extOrderDetailsPanel.add(m_VOLDeltaNeutralOrderType);
		extOrderDetailsPanel.add(new JLabel("VOL: Hedge Delta Aux Price"));
		extOrderDetailsPanel.add(m_VOLDeltaNeutralAuxPrice);
		extOrderDetailsPanel.add(new JLabel(
		        "VOL: Continuously Update Price (0 or 1)"));
		extOrderDetailsPanel.add(m_VOLContinuousUpdate);
		extOrderDetailsPanel.add(new JLabel(
		        "VOL: Reference Price Type (1 or 2)"));
		extOrderDetailsPanel.add(m_VOLReferencePriceType);
		
		extOrderDetailsPanel.add(new JLabel("SCALE: Scale Init Level Size"));
		extOrderDetailsPanel.add(m_scaleInitLevelSize);
		extOrderDetailsPanel.add(new JLabel("SCALE: Scale Subs Level Size"));
		extOrderDetailsPanel.add(m_scaleSubsLevelSize);
		extOrderDetailsPanel.add(new JLabel("SCALE: Scale Price Increment"));
		extOrderDetailsPanel.add(m_scalePriceIncrement);
		
		// create button panel
		final JPanel buttonPanel = new JPanel();
		buttonPanel.add(m_ok);
		buttonPanel.add(m_cancel);
		
		// create action listeners
		m_ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				onOk();
			}
		});
		m_cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				onCancel();
			}
		});
		
		// create dlg box
		getContentPane().add(extOrderDetailsPanel, BorderLayout.CENTER);
		getContentPane().add(buttonPanel, BorderLayout.SOUTH);
		pack();
	}
	
	void onOk() {
		m_rc = false;
		
		try {
			// set extended order fields
			m_order.m_tif = m_tif.getText().trim();
			m_order.m_ocaGroup = m_ocaGroup.getText().trim();
			m_order.m_ocaType = parseInt(m_ocaType);
			
			m_order.m_account = m_account.getText().trim();
			m_order.m_settlingFirm = m_settlingFirm.getText().trim();
			m_order.m_clearingAccount = m_clearingAccount.getText().trim();
			m_order.m_clearingIntent = m_clearingIntent.getText().trim();
			
			m_order.m_openClose = m_openClose.getText().trim();
			m_order.m_origin = parseInt(m_origin);
			m_order.m_orderRef = m_orderRef.getText().trim();
			m_order.m_parentId = parseInt(m_parentId);
			m_order.m_transmit = parseInt(m_transmit) != 0;
			m_order.m_blockOrder = parseInt(m_blockOrder) != 0;
			m_order.m_sweepToFill = parseInt(m_sweepToFill) != 0;
			m_order.m_displaySize = parseInt(m_displaySize);
			m_order.m_triggerMethod = parseInt(m_triggerMethod);
			m_order.m_outsideRth = parseInt(m_outsideRth) != 0;
			m_order.m_hidden = parseInt(m_hidden) != 0;
			m_order.m_discretionaryAmt = parseDouble(m_discretionaryAmt);
			m_order.m_shortSaleSlot = parseInt(m_shortSaleSlot);
			m_order.m_designatedLocation = m_designatedLocation.getText()
			        .trim();
			m_order.m_rule80A = m_rule80A.getText().trim();
			m_order.m_allOrNone = parseInt(m_allOrNone) != 0;
			m_order.m_minQty = parseMaxInt(m_minQty);
			m_order.m_overridePercentageConstraints =
			        parseInt(m_overridePercentageConstraints) != 0;
			m_order.m_percentOffset = parseMaxDouble(m_percentOffset);
			m_order.m_eTradeOnly = parseInt(m_eTradeOnly) != 0;
			m_order.m_firmQuoteOnly = parseInt(m_firmQuoteOnly) != 0;
			m_order.m_nbboPriceCap = parseMaxDouble(m_nbboPriceCap);
			m_order.m_auctionStrategy = parseInt(m_auctionStrategy);
			m_order.m_startingPrice = parseMaxDouble(m_startingPrice);
			m_order.m_stockRefPrice = parseMaxDouble(m_stockRefPrice);
			m_order.m_delta = parseMaxDouble(m_delta);
			m_order.m_stockRangeLower = parseMaxDouble(m_BOXstockRangeLower);
			m_order.m_stockRangeUpper = parseMaxDouble(m_BOXstockRangeUpper);
			m_order.m_volatility = parseMaxDouble(m_VOLVolatility);
			m_order.m_volatilityType = parseMaxInt(m_VOLVolatilityType);
			m_order.m_deltaNeutralOrderType = m_VOLDeltaNeutralOrderType
			        .getText().trim();
			m_order.m_deltaNeutralAuxPrice = parseMaxDouble(m_VOLDeltaNeutralAuxPrice);
			m_order.m_continuousUpdate = parseInt(m_VOLContinuousUpdate);
			m_order.m_referencePriceType = parseMaxInt(m_VOLReferencePriceType);
			m_order.m_trailStopPrice = parseMaxDouble(m_trailStopPrice);
			
			m_order.m_scaleInitLevelSize = parseMaxInt(m_scaleInitLevelSize);
			m_order.m_scaleSubsLevelSize = parseMaxInt(m_scaleSubsLevelSize);
			m_order.m_scalePriceIncrement = parseMaxDouble(m_scalePriceIncrement);
		} catch (final Exception e) {
			Main.inform(this, "Error - " + e);
			return;
		}
		
		m_rc = true;
		setVisible(false);
	}
	
	private int parseMaxInt(final JTextField textField) {
		final String text = textField.getText().trim();
		if (text.length() == 0) {
			return Integer.MAX_VALUE;
		} else {
			return Integer.parseInt(text);
		}
	}
	
	private double parseMaxDouble(final JTextField textField) {
		final String text = textField.getText().trim();
		if (text.length() == 0) {
			return Double.MAX_VALUE;
		} else {
			return Double.parseDouble(text);
		}
	}
	
	private int parseInt(final JTextField textField) {
		final String text = textField.getText().trim();
		if (text.length() == 0) {
			return 0;
		} else {
			return Integer.parseInt(text);
		}
	}
	
	private double parseDouble(final JTextField textField) {
		final String text = textField.getText().trim();
		if (text.length() == 0) {
			return 0;
		} else {
			return Double.parseDouble(text);
		}
	}
	
	void onCancel() {
		m_rc = false;
		setVisible(false);
	}
}
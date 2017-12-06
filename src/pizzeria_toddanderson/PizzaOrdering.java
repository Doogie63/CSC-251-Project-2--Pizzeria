/**
 * Pizza ordering program
 * 4 Dec 2017
 * CSC 251 Project 2 -Pizzeria
 * @author Todd Anderson
 */
package pizzeria_toddanderson;

import java.util.ArrayList;


public class PizzaOrdering extends javax.swing.JFrame {

    /**
     * Creates new form PizzaOrdering
     */
    String _size;
    ArrayList<String> toppingsArray = new ArrayList();
    String _name;
    String _option;
    String _instructions;
    
    String _price;
    
    double _smallPrice = 7.00;
    double _mediumPrice = 9.00;
    double _largePrice = 17.00;
    double _extraLargePrice = 13.00;
    double _toppingPrice = .50;
    double _sizePrice;
    double _totalToppings;
    
    ArrayList<PizzaOrderingSystem> pizzaOrder = new ArrayList();
    
    private void addPepperoni()
    {
        String pepperoni = "Pepperoni";
        if(jCheckBoxPepperoni.isSelected() == true)
        {
            toppingsArray.add(pepperoni);
            _sizePrice += _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
        else
        if(jCheckBoxOnions.isSelected() == false)
        {
            toppingsArray.remove(pepperoni);
            _sizePrice -= _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
    }        
    
    private void addSausage()
    {
         String sausage = "Sausage";
        if(jCheckBoxSausage.isSelected() == true)
        {
            toppingsArray.add(sausage);
            _sizePrice += _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
        else
        if(jCheckBoxOnions.isSelected() == false)
        {
            toppingsArray.remove(sausage);
            _sizePrice -= _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
    }        
    
    
    private void addHam()
    {
        String ham = "Ham";
        if(jCheckBoxHam.isSelected() == true)
        {
            toppingsArray.add(ham);
            _sizePrice += _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
        else
        if(jCheckBoxOnions.isSelected() == false)
        {
            toppingsArray.remove(ham);
            _sizePrice -= _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
    }        
    
    
    private void addBacon()
    {
        String bacon = "Bacon";
        if(jCheckBoxBacon.isSelected() == true)
        {
            toppingsArray.add(bacon);
            _sizePrice += _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
        else
        if(jCheckBoxOnions.isSelected() == false)
        {
            toppingsArray.remove(bacon);
            _sizePrice -= _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
    }        
    
    
    private void addChicken()
    {
        String chicken = "Chicken";
        if(jCheckBoxChicken.isSelected() == true)
        {
            toppingsArray.add(chicken);
            _sizePrice += _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
        else
        if(jCheckBoxOnions.isSelected() == false)
        {
            toppingsArray.remove(chicken);
            _sizePrice -= _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
    }        

    
    private void addHamburger()
    {
        String hamburger = "Hamburger";
        if(jCheckBoxHamburger.isSelected() == true)
        {
            toppingsArray.add(hamburger);
            _sizePrice += _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
        else
        if(jCheckBoxOnions.isSelected() == false)
        {
            toppingsArray.remove(hamburger);
            _sizePrice -= _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
    }        
    
    
    private void addExtraCheese()
    {
        String extraCheese = "ExtraCheese";
        if(jCheckBoxExtraCheese.isSelected() == true)
        {
            toppingsArray.add(extraCheese);
            _sizePrice += _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
        else
        if(jCheckBoxOnions.isSelected() == false)
        {
            toppingsArray.remove(extraCheese);
            _sizePrice -= _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
    }        
    
    
    
    
    private void addOnions()
    {
        String onions = "Onions";
        if(jCheckBoxOnions.isSelected() == true)
        {
            toppingsArray.add(onions);
            _sizePrice += _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
        else
        if(jCheckBoxOnions.isSelected() == false)
        {
            toppingsArray.remove(onions);
            _sizePrice -= _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
    }
    
    
    private void addGreenPeppers()
    {
        String greenPeppers = "GreenPeppers";
        if(jCheckBoxGreenPeppers.isSelected() == true)
        {
            toppingsArray.add(greenPeppers);
            _sizePrice += _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
        else
        if(jCheckBoxOnions.isSelected() == false)
        {
            toppingsArray.remove(greenPeppers);
            _sizePrice -= _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
    }            

    
    private void addMushrooms()
    {
        String mushrooms = "Mushrooms";
        if(jCheckBoxMushrooms.isSelected() == true)
        {
            toppingsArray.add(mushrooms);
            _sizePrice += _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
        else
        if(jCheckBoxOnions.isSelected() == false)
        {
            toppingsArray.remove(mushrooms);
            _sizePrice -= _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
    }        

    
    private void addOlives()
    {  
        String olives = "Olives";
        if(jCheckBoxBlackOlives.isSelected() == true)
        {
            toppingsArray.add(olives);
            _sizePrice += _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
        else
        if(jCheckBoxBlackOlives.isSelected() == false)
        {
            toppingsArray.remove(olives);
            _sizePrice -= _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
            _price = String.valueOf(_sizePrice);
        }
       
    }
    
        
    
    private void pricing()
    {
        toppingsArray.size();
        if(jRadioButtonSmall.isSelected())
        {
            _sizePrice = _smallPrice + toppingsArray.size() * _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
        }
        else
        if(jRadioButtonMedium.isSelected())
        {
            _sizePrice = _mediumPrice + toppingsArray.size() * _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
        }
        else
        if(jRadioButtonLarge.isSelected())
        {
            _sizePrice = _largePrice + toppingsArray.size() * _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
        }
        else
        if(jRadioButtonExtraLarge.isSelected())
        {
            _sizePrice = _extraLargePrice + toppingsArray.size() * _toppingPrice;
            jLabelPrice.setText(String.valueOf(_sizePrice));
        }
    }
    
//    private double totalToppings()
//    {
//        double _totalToppings;
//    }

            
    public PizzaOrdering() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSize = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jButtonOrderButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDisplay = new javax.swing.JTextArea();
        Pic = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonSmall = new javax.swing.JRadioButton();
        jRadioButtonLarge = new javax.swing.JRadioButton();
        jRadioButtonMedium = new javax.swing.JRadioButton();
        jRadioButtonExtraLarge = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButtonGutBuster = new javax.swing.JRadioButton();
        jRadioButtonDeepDish = new javax.swing.JRadioButton();
        jRadioButtonThin = new javax.swing.JRadioButton();
        jRadioButtonHandTossed = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jCheckBoxHamburger = new javax.swing.JCheckBox();
        jCheckBoxGreenPeppers = new javax.swing.JCheckBox();
        jCheckBoxHam = new javax.swing.JCheckBox();
        jCheckBoxBlackOlives = new javax.swing.JCheckBox();
        jCheckBoxPepperoni = new javax.swing.JCheckBox();
        jCheckBoxSausage = new javax.swing.JCheckBox();
        jCheckBoxExtraCheese = new javax.swing.JCheckBox();
        jCheckBoxChicken = new javax.swing.JCheckBox();
        jCheckBoxBacon = new javax.swing.JCheckBox();
        jCheckBoxMushrooms = new javax.swing.JCheckBox();
        jCheckBoxOnions = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Group 1 Pizzeria");

        jLabel6.setText("Price: $");

        jLabelPrice.setText("0.0");

        jButtonOrderButton.setText("Order!");
        jButtonOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrderButtonActionPerformed(evt);
            }
        });

        jTextAreaDisplay.setColumns(20);
        jTextAreaDisplay.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDisplay);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Size:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        buttonGroupSize.add(jRadioButtonSmall);
        jRadioButtonSmall.setText("Small");
        jRadioButtonSmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSmallActionPerformed(evt);
            }
        });

        buttonGroupSize.add(jRadioButtonLarge);
        jRadioButtonLarge.setText("Large");
        jRadioButtonLarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonLargeActionPerformed(evt);
            }
        });

        buttonGroupSize.add(jRadioButtonMedium);
        jRadioButtonMedium.setText("Medium");
        jRadioButtonMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMediumActionPerformed(evt);
            }
        });

        buttonGroupSize.add(jRadioButtonExtraLarge);
        jRadioButtonExtraLarge.setText("Extra Large");
        jRadioButtonExtraLarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonExtraLargeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonSmall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonMedium)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonLarge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonExtraLarge)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonSmall)
                    .addComponent(jRadioButtonMedium)
                    .addComponent(jRadioButtonLarge)
                    .addComponent(jRadioButtonExtraLarge))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Crust:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jRadioButtonGutBuster.setText("Gut-Buster");

        jRadioButtonDeepDish.setText("Deep-Dish");

        jRadioButtonThin.setText("Thin");

        jRadioButtonHandTossed.setText("Hand-Tossed");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonThin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonHandTossed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonDeepDish)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonGutBuster)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonThin)
                    .addComponent(jRadioButtonHandTossed)
                    .addComponent(jRadioButtonDeepDish)
                    .addComponent(jRadioButtonGutBuster))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Toppings:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jCheckBoxHamburger.setText("Hamburger");
        jCheckBoxHamburger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxHamburgerActionPerformed(evt);
            }
        });

        jCheckBoxGreenPeppers.setText("Green Peppers");
        jCheckBoxGreenPeppers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxGreenPeppersActionPerformed(evt);
            }
        });

        jCheckBoxHam.setText("Ham");
        jCheckBoxHam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxHamActionPerformed(evt);
            }
        });

        jCheckBoxBlackOlives.setText("Black Olives");
        jCheckBoxBlackOlives.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBlackOlivesActionPerformed(evt);
            }
        });

        jCheckBoxPepperoni.setText("Pepperoni");
        jCheckBoxPepperoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPepperoniActionPerformed(evt);
            }
        });

        jCheckBoxSausage.setText("Sausage");
        jCheckBoxSausage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSausageActionPerformed(evt);
            }
        });

        jCheckBoxExtraCheese.setText("Extra Cheese");
        jCheckBoxExtraCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxExtraCheeseActionPerformed(evt);
            }
        });

        jCheckBoxChicken.setText("Chicken");
        jCheckBoxChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxChickenActionPerformed(evt);
            }
        });

        jCheckBoxBacon.setText("Bacon");
        jCheckBoxBacon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBaconActionPerformed(evt);
            }
        });

        jCheckBoxMushrooms.setText("Mushrooms");
        jCheckBoxMushrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMushroomsActionPerformed(evt);
            }
        });

        jCheckBoxOnions.setText("Onions");
        jCheckBoxOnions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxOnionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxSausage)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxPepperoni)
                            .addComponent(jCheckBoxHam))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxChicken)
                            .addComponent(jCheckBoxHamburger)
                            .addComponent(jCheckBoxBacon))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxExtraCheese)
                    .addComponent(jCheckBoxOnions)
                    .addComponent(jCheckBoxGreenPeppers))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxBlackOlives)
                    .addComponent(jCheckBoxMushrooms))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxPepperoni)
                    .addComponent(jCheckBoxExtraCheese)
                    .addComponent(jCheckBoxBacon)
                    .addComponent(jCheckBoxMushrooms))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxBlackOlives, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxSausage)
                    .addComponent(jCheckBoxChicken)
                    .addComponent(jCheckBoxOnions))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxHamburger)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBoxHam)
                        .addComponent(jCheckBoxGreenPeppers)))
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzeria_toddanderson/Group1smaller.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Pic))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonOrderButton)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxOnionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxOnionsActionPerformed
        addOnions();
    }//GEN-LAST:event_jCheckBoxOnionsActionPerformed

    private void jCheckBoxBlackOlivesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBlackOlivesActionPerformed
        addOlives();
    }//GEN-LAST:event_jCheckBoxBlackOlivesActionPerformed
 
    private void jButtonOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrderButtonActionPerformed
        //Client Name:
        //_name = jTextFieldName.getText();
        
        //Pizza Instructions:
        //_instructions = jTextFieldInstructions.getText();
        
        //Option (Delivery or Carryout):
        
        
       // _option = Crust;
        
        
        if(jRadioButtonThin.isSelected())
        {
            _option = jRadioButtonThin.getText();
        }
        else
        if(jRadioButtonHandTossed.isSelected())
        {
            _option = jRadioButtonHandTossed.getText();
        }
        else
        if(jRadioButtonDeepDish.isSelected())
        {
            _option = jRadioButtonDeepDish.getText();
        }
        else
        if(jRadioButtonGutBuster.isSelected())
        {
            _option = jRadioButtonGutBuster.getText();
        }
        
        
        
        
        //Pizza Toppings:
        if(jCheckBoxBlackOlives.isSelected())
        {
            String olives = jCheckBoxBlackOlives.getText();
        }
        if(jCheckBoxOnions.isSelected())
        {
            String onions = jCheckBoxOnions.getText();
        }
        if(jCheckBoxGreenPeppers.isSelected())
        {
            String roastedGreenPeppers = jCheckBoxGreenPeppers.getText();
        }
        
        
        //Pizza Size String:
        if(jRadioButtonSmall.isSelected())
        {
            _size = jRadioButtonSmall.getText();
        }
        else
        if(jRadioButtonMedium.isSelected())
        {
            _size = jRadioButtonMedium.getText();
        }
        else
        if(jRadioButtonLarge.isSelected())
        {
            _size = jRadioButtonLarge.getText();
        }
        else
        if(jRadioButtonExtraLarge.isSelected())
        {
            _size = jRadioButtonExtraLarge.getText();
        }
        
        
        //Adds pizza object to array:
        pizzaOrder.add(new PizzaOrderingSystem(_size, toppingsArray, _name, _instructions, _option, _price));
        for (PizzaOrderingSystem pizzaOrderingSystem : pizzaOrder)
        {
            jTextAreaDisplay.append(pizzaOrder.toString());//Display
        }
    }//GEN-LAST:event_jButtonOrderButtonActionPerformed

    private void jRadioButtonSmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSmallActionPerformed
        pricing();
    }//GEN-LAST:event_jRadioButtonSmallActionPerformed

    private void jRadioButtonMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMediumActionPerformed
        pricing();
    }//GEN-LAST:event_jRadioButtonMediumActionPerformed

    private void jCheckBoxGreenPeppersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxGreenPeppersActionPerformed
        addGreenPeppers();
    }//GEN-LAST:event_jCheckBoxGreenPeppersActionPerformed

    private void jRadioButtonLargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonLargeActionPerformed
        pricing();
    }//GEN-LAST:event_jRadioButtonLargeActionPerformed

    private void jRadioButtonExtraLargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonExtraLargeActionPerformed
        pricing();
    }//GEN-LAST:event_jRadioButtonExtraLargeActionPerformed

    private void jCheckBoxPepperoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPepperoniActionPerformed
        addPepperoni();
    }//GEN-LAST:event_jCheckBoxPepperoniActionPerformed

    private void jCheckBoxSausageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSausageActionPerformed
        addSausage();
    }//GEN-LAST:event_jCheckBoxSausageActionPerformed

    private void jCheckBoxHamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxHamActionPerformed
        addHam ();  
    }//GEN-LAST:event_jCheckBoxHamActionPerformed

    private void jCheckBoxBaconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBaconActionPerformed
        addBacon ();
    }//GEN-LAST:event_jCheckBoxBaconActionPerformed

    private void jCheckBoxChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxChickenActionPerformed
        addChicken ();
    }//GEN-LAST:event_jCheckBoxChickenActionPerformed

    private void jCheckBoxHamburgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxHamburgerActionPerformed
        addHamburger ();
    }//GEN-LAST:event_jCheckBoxHamburgerActionPerformed

    private void jCheckBoxExtraCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxExtraCheeseActionPerformed
        addExtraCheese ();
    }//GEN-LAST:event_jCheckBoxExtraCheeseActionPerformed

    private void jCheckBoxMushroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMushroomsActionPerformed
        addMushrooms ();
    }//GEN-LAST:event_jCheckBoxMushroomsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PizzaOrdering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaOrdering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaOrdering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaOrdering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PizzaOrdering().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pic;
    private javax.swing.ButtonGroup buttonGroupSize;
    private javax.swing.JButton jButtonOrderButton;
    private javax.swing.JCheckBox jCheckBoxBacon;
    private javax.swing.JCheckBox jCheckBoxBlackOlives;
    private javax.swing.JCheckBox jCheckBoxChicken;
    private javax.swing.JCheckBox jCheckBoxExtraCheese;
    private javax.swing.JCheckBox jCheckBoxGreenPeppers;
    private javax.swing.JCheckBox jCheckBoxHam;
    private javax.swing.JCheckBox jCheckBoxHamburger;
    private javax.swing.JCheckBox jCheckBoxMushrooms;
    private javax.swing.JCheckBox jCheckBoxOnions;
    private javax.swing.JCheckBox jCheckBoxPepperoni;
    private javax.swing.JCheckBox jCheckBoxSausage;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonDeepDish;
    private javax.swing.JRadioButton jRadioButtonExtraLarge;
    private javax.swing.JRadioButton jRadioButtonGutBuster;
    private javax.swing.JRadioButton jRadioButtonHandTossed;
    private javax.swing.JRadioButton jRadioButtonLarge;
    private javax.swing.JRadioButton jRadioButtonMedium;
    private javax.swing.JRadioButton jRadioButtonSmall;
    private javax.swing.JRadioButton jRadioButtonThin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDisplay;
    // End of variables declaration//GEN-END:variables
}

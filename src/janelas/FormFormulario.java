package janelas;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joao.oliveira
 */
public class FormFormulario extends javax.swing.JFrame {

    /**
     * Creates new form FormFormulario
     */
    private String username;
    private String segmento;

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public FormFormulario() {

        initComponents();

    }

    public FormFormulario(String user) {

        this.username = user;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ufCmb = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        graAreaCmb = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        tratamentoCmb = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        atividadeCmb = new javax.swing.JComboBox();
        labelCond = new javax.swing.JLabel();
        locCirTerTxt = new javax.swing.JTextField();
        labelFuncionario = new javax.swing.JLabel();
        funcionarioCmb = new javax.swing.JComboBox();
        labelDecoder = new javax.swing.JLabel();
        decoderTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        materialTxt = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel(new FlowLayout(FlowLayout.CENTER));
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        producaoTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        itemSair = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulário - Controle de Produtividade");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("UF:");

        ufCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CE", "MA", "PI" }));
        ufCmb.setSelectedIndex(-1);
        ufCmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ufCmbItemStateChanged(evt);
            }
        });

        jLabel2.setText("GRA / Área:");

        jLabel3.setText("Tipo de Tratamento:");

        jLabel4.setText("Tipo de Atividade:");

        labelCond.setText("Localidade/Circuito/Terminal/Número DTH:");

        labelFuncionario.setText("Funcionário:");

        labelDecoder.setText("Decorder:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Material Utilizado:");

        materialTxt.setColumns(20);
        materialTxt.setRows(5);
        jScrollPane1.setViewportView(materialTxt);

        jButton1.setBackground(new java.awt.Color(51, 102, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setLabel("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        producaoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }

        )
    );
    jScrollPane4.setViewportView(producaoTable);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(382, 382, 382)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addContainerGap(13, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ufCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(graAreaCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tratamentoCmb, 0, 147, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(atividadeCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(labelCond)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(locCirTerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(labelDecoder)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(decoderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(labelFuncionario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(funcionarioCmb, 0, 605, Short.MAX_VALUE)))
                    .addGap(250, 250, 250))))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap(22, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(ufCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(graAreaCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3)
                .addComponent(tratamentoCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4)
                .addComponent(atividadeCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelCond)
                .addComponent(locCirTerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labelDecoder)
                .addComponent(decoderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelFuncionario)
                .addComponent(funcionarioCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    jMenu3.setText("Sistema");

    itemSair.setText("Sair");
    itemSair.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            itemSairActionPerformed(evt);
        }
    });
    jMenu3.add(itemSair);

    jMenuBar1.add(jMenu3);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        this.setTitle("Usuário: " + this.getUsername() + " - Segmento: " + this.getSegmento());
        
        // ATRIBUI AS ATIVIDADES E TRATAMENTOS DO BANCO NAS COMBOBOXES
        data.access.object.DAOAtividades Atividades = new data.access.object.DAOAtividades();
        data.access.object.DAOTratamentos Tratamentos = new data.access.object.DAOTratamentos();
        data.access.object.DAOControlador DAOControlador = new data.access.object.DAOControlador();

        try {
            this.setSegmento(DAOControlador.getSegmento(this.getUsername()));
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Erro: " + ex.toString());
        }

        try {

            List listAtividades = Atividades.atividadesPorSegmento(this.getSegmento());
            for (int i = 0; i <= listAtividades.size() - 1; i++) {

                Map obj = (Map) listAtividades.get(i);
                this.atividadeCmb.addItem(obj.get("ATIVIDADE"));

            }

            List listTratamentos = Tratamentos.getTratamentos();
            for (int i = 0; i <= listTratamentos.size() - 1; i++) {

                Map obj = (Map) listTratamentos.get(i);
                this.tratamentoCmb.addItem(obj.get("TRATAMENTO"));

            }

        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

        this.atividadeCmb.setSelectedIndex(-1);
        this.tratamentoCmb.setSelectedIndex(-1);

        try {
            this.atualizaProducao();
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

        // CONDICIONA O NOME DA LABEL DE ACORDO COM O SEGMENTO
        this.labelDecoder.setVisible(false); // Só ficará visivel se o segmento for DTH
        this.decoderTxt.setVisible(false);
        this.producaoTable.getColumnModel().getColumn(8).setMinWidth(0);
        this.producaoTable.getColumnModel().getColumn(8).setMaxWidth(0);
        int defaultWidth = this.producaoTable.getColumnModel().getColumn(0).getWidth();

        switch (this.getSegmento().toLowerCase()) {

            case "dados":
                this.labelCond.setText("Localidade/Terminal/Circuito:");
                break;
            case "sala de prioridades":
                this.labelCond.setText("Localidade/Terminal/Circuito:");
                this.labelFuncionario.setVisible(false);
                this.funcionarioCmb.setVisible(false);
                this.producaoTable.getColumnModel().getColumn(5).setMinWidth(0);
                this.producaoTable.getColumnModel().getColumn(5).setMaxWidth(0);
                break;
            case "fibra":
                this.labelCond.setText("Localidade/Terminal/Circuito/Número Evento:");
                break;
            case "massivo":
                this.labelCond.setText("Localidade/Terminal/Número Evento:");
                break;
            case "dth":
                this.labelCond.setText("Ordem de Serviço DTH:");
                this.labelDecoder.setVisible(true);
                this.decoderTxt.setVisible(true);
                this.producaoTable.getColumnModel().getColumn(8).setMinWidth(defaultWidth);
                this.producaoTable.getColumnModel().getColumn(8).setMaxWidth(defaultWidth);
                break;

        }

        this.setTitle("Usuário: " + this.getUsername() + " - Segmento: " + this.getSegmento());

    }//GEN-LAST:event_formWindowOpened

    private void ufCmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ufCmbItemStateChanged

        JComboBox cb = (JComboBox) evt.getSource();
        Object item = evt.getItem();

        if (evt.getStateChange() == ItemEvent.SELECTED) {

            String uf = item.toString();
            data.access.object.DAOGra DAOGra = new data.access.object.DAOGra();
            data.access.object.DAOTecnico DAOTecnico = new data.access.object.DAOTecnico();

            try {

                List gras = DAOGra.getGrasPorUF(uf);
                List tecnicos = DAOTecnico.tecnicosPorSegmentoEUF(this.getSegmento(), uf);
                this.graAreaCmb.removeAllItems();
                for (int i = 0; i <= gras.size() - 1; i++) {

                    Map obj = (Map) gras.get(i);
                    this.graAreaCmb.addItem(obj.get("GRA"));

                }

                this.graAreaCmb.setSelectedIndex(-1);

                this.funcionarioCmb.removeAllItems();
                for (int i = 0; i <= tecnicos.size() - 1; i++) {

                    Map obj = (Map) tecnicos.get(i);
                    this.funcionarioCmb.addItem(obj.get("TECNICO"));

                }

                this.funcionarioCmb.setSelectedIndex(-1);

            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }

        } else if (evt.getStateChange() == ItemEvent.DESELECTED) {

        }

    }//GEN-LAST:event_ufCmbItemStateChanged

    private void itemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSairActionPerformed
        // TODO add your handling code here:
        FormLogin frm = new FormLogin();
        frm.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_itemSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        data.access.object.DAOControlador DAOControlador = new data.access.object.DAOControlador();

        Object uf = this.ufCmb.getSelectedItem();
        Object gra = this.graAreaCmb.getSelectedItem();
        Object atividade = this.atividadeCmb.getSelectedItem();
        Object tratamento = this.tratamentoCmb.getSelectedItem();
        String locCirTer = this.locCirTerTxt.getText().replace("'","");
        String decoder = this.decoderTxt.getText().replace("'","");
        Object funcionario = this.funcionarioCmb.getSelectedItem();
        String material = this.materialTxt.getText().replace("'","");
        String nome = "";
        String d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());

        try {

            nome = DAOControlador.getNome(this.getUsername());

        } catch (SQLException | ClassNotFoundException e) {

            JOptionPane.showMessageDialog(null, e.toString());

        }

        if (uf == null) {

            JOptionPane.showMessageDialog(null, "A UF é obrigatória");
            return;

        } else if (gra == null) {

            JOptionPane.showMessageDialog(null, "O GRA é obrigatório");
            return;

        } else if (tratamento == null) {

            JOptionPane.showMessageDialog(null, "O TRATAMENTO é obrigatório");
            return;

        } else if (atividade == null) {

            JOptionPane.showMessageDialog(null, "A ATIVIDADE é obrigatória");
            return;

        }

        if (funcionario == null) {

            if (tratamento.toString().equalsIgnoreCase("pendenciamento") | tratamento.toString().equalsIgnoreCase("encerramento")
                    | tratamento.toString().equalsIgnoreCase("tramitação")) {

                JOptionPane.showMessageDialog(null, "O FUNCIONARIO é obrigatório");
                return;

            }

        }

        if (this.getSegmento().equalsIgnoreCase("dth")) {

            if (decoder.equals("")) {

                if (decoderObrigatorio()) {

                    JOptionPane.showMessageDialog(null, "O DECODER é obrigatório para essa atividade!");
                    return;

                }

            }

        }

        String[] infoFuncionario;
        String matriculaFunc = "";

        if (funcionario != null) {

            infoFuncionario = funcionario.toString().split("-");
            matriculaFunc = infoFuncionario[1];

        }

        model.Producao Producao = new model.Producao();
        data.access.object.DAOProducao DAOProducao = new data.access.object.DAOProducao();

        Producao.setControlador(nome);
        Producao.setDataEntrada(d);
        Producao.setUf(uf.toString());
        Producao.setGra(gra.toString());
        Producao.setSegmento(this.getSegmento());
        Producao.setAtividade(atividade.toString());
        Producao.setTratamento(tratamento.toString());
        Producao.setLocCirTer(locCirTer);
        Producao.setMaterialAplicado(material);
        Producao.setTecnico(matriculaFunc);
        Producao.setUsername(this.getUsername());
        Producao.setDecoder(decoder);

// TESTAR O REGISTRAR PRODUÇÃO        
        
        try {
            DAOProducao.registrarProducao(Producao);
            this.atualizaProducao();
            this.limpaCampos();
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    boolean decoderObrigatorio() {

        String atividade = this.atividadeCmb.getSelectedItem().toString();
        boolean var = false;

        switch (atividade) {

            case "ALTERAÇÃO":
                var = true;
                break;

            case "ALTERAÇÃO DE PLANO":
                var = true;
                break;

            case "RETIRADA DE EQUIPAMENTO":
                var = true;
                break;

            case "RETIRADA DE PONTO":
                var = true;
                break;

        }

        return var;

    }

    private void atualizaProducao() throws SQLException, ClassNotFoundException {

        data.access.object.DAOProducao DAOProducao = new data.access.object.DAOProducao();
        List producao = DAOProducao.getProducaoPorUsuario(this.getUsername());
        Object[] colunaNomes = {"UF", "GRA", "Segmento", "Tratamento", "Atividade", "Tecnico", "Material Ap.",
            "Loc_Cir_Ter", "Decoder"};
        DefaultTableModel dados = new DefaultTableModel(new Object[0][0], colunaNomes) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        for (int i = 0; i <= producao.size() - 1; i++) {

            Map obj = (Map) producao.get(i);
            Object[] valores = {obj.get("uf"), obj.get("gra"), obj.get("segmento"), obj.get("tratamento"),
                obj.get("atividade"), obj.get("TECNICO"), obj.get("material_aplicado"), obj.get("loc_cir_ter"), 
                obj.get("decoder")};
            dados.addRow(valores);

        }

        this.producaoTable.setModel(dados);
        this.producaoTable.changeSelection(producaoTable.getRowCount() - 1, 0, false, false);

        if (this.getSegmento().equalsIgnoreCase("sala de prioridades")) {

            this.producaoTable.getColumnModel().getColumn(5).setMinWidth(0);
            this.producaoTable.getColumnModel().getColumn(5).setMaxWidth(0);

        }
        
        if (!this.getSegmento().equalsIgnoreCase("dth")) {

            this.producaoTable.getColumnModel().getColumn(8).setMinWidth(0);
            this.producaoTable.getColumnModel().getColumn(8).setMaxWidth(0);

        }

    }

    private void limpaCampos() {

        this.ufCmb.setSelectedIndex(-1);
        this.graAreaCmb.setSelectedIndex(-1);
        this.atividadeCmb.setSelectedIndex(-1);
        this.tratamentoCmb.setSelectedIndex(-1);
        this.locCirTerTxt.setText("");
        this.decoderTxt.setText("");
        this.materialTxt.setText("");
        this.funcionarioCmb.setSelectedIndex(-1);

    }

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
            java.util.logging.Logger.getLogger(FormFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox atividadeCmb;
    private javax.swing.JTextField decoderTxt;
    private javax.swing.JComboBox funcionarioCmb;
    private javax.swing.JComboBox graAreaCmb;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelCond;
    private javax.swing.JLabel labelDecoder;
    private javax.swing.JLabel labelFuncionario;
    private javax.swing.JTextField locCirTerTxt;
    private javax.swing.JTextArea materialTxt;
    private javax.swing.JTable producaoTable;
    private javax.swing.JComboBox tratamentoCmb;
    private javax.swing.JComboBox ufCmb;
    // End of variables declaration//GEN-END:variables
}

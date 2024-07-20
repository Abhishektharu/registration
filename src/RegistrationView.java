import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RegistrationView {
    JFrame frmMain;
    JLabel lblName, lblGender, lblAge, lblAddress, lblEmpty;
    JCheckBox chkStudent;
    JRadioButton rdoFemale, rdoMale, rdoOthers;
    JTextField txtName, txtAge, txtAddress;
    JButton btnSave, btnReset;
    JPanel pnlMain, pnlGender;

    DefaultTableModel defaultTableModel;
    JTable tblData;
    JScrollPane scrData;

    Dimension dimTextField = new Dimension(250, 28);
    Dimension dimLabel = new Dimension(150, 28);

    Font lblFont = new Font("Arial", Font.BOLD, 12);
    Font txtFont = new Font("Arial", Font.BOLD + Font.ITALIC, 12);

    public RegistrationView() {
        frmMain = new JFrame("Registration Form");
        frmMain.setSize(new Dimension(450, 450));
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMain.setLocation(100, 100);
        frmMain.setResizable(false);

        pnlGender = new JPanel();
        pnlGender.setLayout(new GridLayout(1, 3));

        rdoFemale = new JRadioButton("Female", true);
        rdoFemale.setFont(lblFont);
        rdoMale = new JRadioButton("Male");
        rdoMale.setFont(lblFont);
        rdoOthers = new JRadioButton("Others");
        rdoOthers.setFont(lblFont);

        ButtonGroup btnGrpGender = new ButtonGroup();
        btnGrpGender.add(rdoFemale);
        btnGrpGender.add(rdoMale);
        btnGrpGender.add(rdoOthers);

        pnlGender.add(rdoFemale);
        pnlGender.add(rdoMale);
        pnlGender.add(rdoOthers);

        lblName = new JLabel("Name");
        lblName.setPreferredSize(dimLabel);
        lblName.setHorizontalAlignment(JLabel.RIGHT);

        lblGender = new JLabel("Gender");
        lblGender.setPreferredSize(dimLabel);
        lblGender.setHorizontalAlignment(JLabel.RIGHT);

        lblAge = new JLabel("Age");
        lblAge.setPreferredSize(dimLabel);
        lblAge.setHorizontalAlignment(JLabel.RIGHT);

        lblAddress = new JLabel("Address");
        lblAddress.setPreferredSize(dimLabel);
        lblAddress.setHorizontalAlignment(JLabel.RIGHT);

        lblEmpty = new JLabel();
        lblEmpty.setPreferredSize(dimLabel);

        txtName = new JTextField();
        txtName.setPreferredSize(dimTextField);
        txtName.setFont(txtFont);

        txtAge = new JTextField();
        txtAge.setPreferredSize(dimTextField);
        txtAge.setFont(txtFont);

        txtAddress = new JTextField();
        txtAddress.setPreferredSize(dimTextField);
        txtAddress.setFont(txtFont);

        chkStudent = new JCheckBox("Student?");
        chkStudent.setFont(lblFont);
        chkStudent.setPreferredSize(dimLabel);

        String[] colName = new String[] {"Name", "Gender", "Age", "Address", "Student?"};
        Object[][] data = new Object[][] {};
        defaultTableModel = new DefaultTableModel(data, colName);
        tblData = new JTable(defaultTableModel);
        scrData = new JScrollPane(tblData);
        scrData.setPreferredSize(new Dimension(425, 150));

        btnSave = new JButton("Save");
        btnReset = new JButton("Reset");

        pnlMain = new JPanel();
        pnlMain.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10));

        pnlMain.add(lblName);
        pnlMain.add(txtName);
        pnlMain.add(lblEmpty);
        pnlMain.add(chkStudent);
        pnlMain.add(lblGender);
        pnlMain.add(pnlGender);
        pnlMain.add(lblAge);
        pnlMain.add(txtAge);
        pnlMain.add(lblAddress);
        pnlMain.add(txtAddress);
        pnlMain.add(scrData);
        pnlMain.add(btnSave);
        pnlMain.add(btnReset);

        frmMain.add(pnlMain);
        frmMain.setVisible(true);
    }
}

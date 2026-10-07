package h3;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.namso_gen.spacehowen.R;
import com.google.android.material.textfield.TextInputEditText;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 extends androidx.fragment.app.s {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public TextInputEditText f4894f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Spinner f4895g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public z2 f4896h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Button f4897i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public View f4898j0;
    public TextView k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public TextView f4899l0;

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_temp_mail, viewGroup, false);
    }

    @Override // androidx.fragment.app.s
    public final void M(Bundle bundle, View view) {
        jc.i.e(view, "view");
        this.f4894f0 = (TextInputEditText) view.findViewById(R.id.editUsername);
        this.f4895g0 = (Spinner) view.findViewById(R.id.spinnerDomain);
        ArrayAdapter<CharSequence> arrayAdapterCreateFromResource = ArrayAdapter.createFromResource(U(), R.array.catchmail_domain_array, android.R.layout.simple_spinner_item);
        jc.i.d(arrayAdapterCreateFromResource, "createFromResource(...)");
        arrayAdapterCreateFromResource.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = this.f4895g0;
        yb.d dVar = null;
        if (spinner == null) {
            jc.i.i("domainSpinner");
            throw null;
        }
        spinner.setAdapter((SpinnerAdapter) arrayAdapterCreateFromResource);
        Spinner spinner2 = this.f4895g0;
        if (spinner2 == null) {
            jc.i.i("domainSpinner");
            throw null;
        }
        spinner2.setSelection(2);
        View viewFindViewById = view.findViewById(R.id.btnCustom);
        jc.i.d(viewFindViewById, "findViewById(...)");
        Button button = (Button) viewFindViewById;
        button.setText(v(R.string.temp_mail_btn_custom_premium));
        View viewFindViewById2 = view.findViewById(R.id.btnRandom);
        jc.i.d(viewFindViewById2, "findViewById(...)");
        Button button2 = (Button) viewFindViewById2;
        this.f4897i0 = (Button) view.findViewById(R.id.btnClearHistory);
        this.f4898j0 = view.findViewById(R.id.selectionBar);
        this.k0 = (TextView) view.findViewById(R.id.textSelectionInfo);
        this.f4899l0 = (TextView) view.findViewById(R.id.btnDeleteSelected);
        View viewFindViewById3 = view.findViewById(R.id.btnCancelSelection);
        jc.i.d(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        this.f4896h0 = new z2(new v2(this, 0), new v2(this, 1));
        View viewFindViewById4 = view.findViewById(R.id.recyclerTempMailEmails);
        jc.i.d(viewFindViewById4, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        U();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        z2 z2Var = this.f4896h0;
        if (z2Var == null) {
            jc.i.i("adapter");
            throw null;
        }
        recyclerView.setAdapter(z2Var);
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: h3.w2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x2 f4887b;

            {
                this.f4887b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String string;
                switch (i) {
                    case 0:
                        x2 x2Var = this.f4887b;
                        if (!x2Var.U().getSharedPreferences("app_settings", 0).getBoolean("is_premium_cached", false)) {
                            androidx.fragment.app.i0 i0VarT = x2Var.t();
                            androidx.fragment.app.s sVarY = i0VarT.y("SubscriptionDialog");
                            m3.b bVar = sVarY instanceof m3.b ? (m3.b) sVarY : null;
                            if (bVar == null || !bVar.y()) {
                                m3.b bVar2 = new m3.b();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("arg_reason", "custom_email");
                                bVar2.Y(bundle2);
                                bVar2.e0(i0VarT, "SubscriptionDialog");
                                return;
                            }
                            return;
                        }
                        TextInputEditText textInputEditText = x2Var.f4894f0;
                        if (textInputEditText == null) {
                            jc.i.i("editUsername");
                            throw null;
                        }
                        Editable text = textInputEditText.getText();
                        String string2 = (text == null || (string = text.toString()) == null) ? null : pc.g.B0(string).toString();
                        if (string2 == null) {
                            string2 = "";
                        }
                        Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9._-]{3,30}$");
                        jc.i.d(patternCompile, "compile(...)");
                        if (!patternCompile.matcher(string2).matches()) {
                            Toast.makeText(x2Var.U(), x2Var.v(R.string.invalid_username), 0).show();
                            return;
                        }
                        Spinner spinner3 = x2Var.f4895g0;
                        if (spinner3 == null) {
                            jc.i.i("domainSpinner");
                            throw null;
                        }
                        rc.b0.q(androidx.lifecycle.i0.e(x2Var.x()), null, new a2.g(x2Var, string2 + '@' + spinner3.getSelectedItem().toString(), null, 15), 3);
                        return;
                    case 1:
                        String string3 = UUID.randomUUID().toString();
                        jc.i.d(string3, "toString(...)");
                        String strConcat = "user".concat(pc.g.A0(8, string3));
                        x2 x2Var2 = this.f4887b;
                        String[] stringArray = x2Var2.u().getStringArray(R.array.catchmail_domain_array);
                        jc.i.d(stringArray, "getStringArray(...)");
                        kc.c cVar = kc.d.f6206a;
                        if (stringArray.length == 0) {
                            throw new NoSuchElementException("Array is empty.");
                        }
                        int length = stringArray.length;
                        cVar.getClass();
                        rc.b0.q(androidx.lifecycle.i0.e(x2Var2.x()), null, new a2.g(x2Var2, strConcat + '@' + stringArray[kc.d.f6207b.f().nextInt(length)], null, 15), 3);
                        return;
                    case 2:
                        x2 x2Var3 = this.f4887b;
                        z2 z2Var2 = x2Var3.f4896h0;
                        if (z2Var2 == null) {
                            jc.i.i("adapter");
                            throw null;
                        }
                        if (z2Var2.h) {
                            x2Var3.b0();
                            return;
                        }
                        z2Var2.k(true);
                        Button button3 = x2Var3.f4897i0;
                        if (button3 == null) {
                            jc.i.i("btnClearHistory");
                            throw null;
                        }
                        button3.setVisibility(8);
                        View view3 = x2Var3.f4898j0;
                        if (view3 == null) {
                            jc.i.i("selectionBar");
                            throw null;
                        }
                        view3.setVisibility(0);
                        TextView textView2 = x2Var3.k0;
                        if (textView2 == null) {
                            jc.i.i("textSelectionInfo");
                            throw null;
                        }
                        textView2.setText(x2Var3.v(R.string.tmph_select_hint));
                        TextView textView3 = x2Var3.f4899l0;
                        if (textView3 != null) {
                            textView3.setEnabled(false);
                            return;
                        } else {
                            jc.i.i("btnDeleteSelected");
                            throw null;
                        }
                    case 3:
                        this.f4887b.b0();
                        return;
                    default:
                        x2 x2Var4 = this.f4887b;
                        z2 z2Var3 = x2Var4.f4896h0;
                        if (z2Var3 == null) {
                            jc.i.i("adapter");
                            throw null;
                        }
                        Set setQ0 = vb.i.q0(z2Var3.f4925g);
                        if (setQ0.isEmpty()) {
                            Toast.makeText(x2Var4.U(), x2Var4.v(R.string.tmph_select_none), 0).show();
                            return;
                        }
                        List listN0 = vb.i.n0(setQ0);
                        ea.j jVar = new ea.j(x2Var4.U(), R.style.MyDialogTheme);
                        String strV = x2Var4.v(R.string.tmph_delete_confirm_title);
                        g.b bVar3 = (g.b) jVar.f3530b;
                        bVar3.f3971d = strV;
                        bVar3.f3972f = x2Var4.w(R.string.tmph_delete_confirm_message, Integer.valueOf(listN0.size()));
                        jVar.k(x2Var4.v(R.string.tmph_delete_selected), new e(2, x2Var4, listN0));
                        jVar.h(x2Var4.v(R.string.btn_cancel), null);
                        g.f fVarA = jVar.a();
                        fVarA.setOnShowListener(new f(fVarA, 4));
                        fVarA.show();
                        return;
                }
            }
        });
        final int i10 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: h3.w2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x2 f4887b;

            {
                this.f4887b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String string;
                switch (i10) {
                    case 0:
                        x2 x2Var = this.f4887b;
                        if (!x2Var.U().getSharedPreferences("app_settings", 0).getBoolean("is_premium_cached", false)) {
                            androidx.fragment.app.i0 i0VarT = x2Var.t();
                            androidx.fragment.app.s sVarY = i0VarT.y("SubscriptionDialog");
                            m3.b bVar = sVarY instanceof m3.b ? (m3.b) sVarY : null;
                            if (bVar == null || !bVar.y()) {
                                m3.b bVar2 = new m3.b();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("arg_reason", "custom_email");
                                bVar2.Y(bundle2);
                                bVar2.e0(i0VarT, "SubscriptionDialog");
                                return;
                            }
                            return;
                        }
                        TextInputEditText textInputEditText = x2Var.f4894f0;
                        if (textInputEditText == null) {
                            jc.i.i("editUsername");
                            throw null;
                        }
                        Editable text = textInputEditText.getText();
                        String string2 = (text == null || (string = text.toString()) == null) ? null : pc.g.B0(string).toString();
                        if (string2 == null) {
                            string2 = "";
                        }
                        Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9._-]{3,30}$");
                        jc.i.d(patternCompile, "compile(...)");
                        if (!patternCompile.matcher(string2).matches()) {
                            Toast.makeText(x2Var.U(), x2Var.v(R.string.invalid_username), 0).show();
                            return;
                        }
                        Spinner spinner3 = x2Var.f4895g0;
                        if (spinner3 == null) {
                            jc.i.i("domainSpinner");
                            throw null;
                        }
                        rc.b0.q(androidx.lifecycle.i0.e(x2Var.x()), null, new a2.g(x2Var, string2 + '@' + spinner3.getSelectedItem().toString(), null, 15), 3);
                        return;
                    case 1:
                        String string3 = UUID.randomUUID().toString();
                        jc.i.d(string3, "toString(...)");
                        String strConcat = "user".concat(pc.g.A0(8, string3));
                        x2 x2Var2 = this.f4887b;
                        String[] stringArray = x2Var2.u().getStringArray(R.array.catchmail_domain_array);
                        jc.i.d(stringArray, "getStringArray(...)");
                        kc.c cVar = kc.d.f6206a;
                        if (stringArray.length == 0) {
                            throw new NoSuchElementException("Array is empty.");
                        }
                        int length = stringArray.length;
                        cVar.getClass();
                        rc.b0.q(androidx.lifecycle.i0.e(x2Var2.x()), null, new a2.g(x2Var2, strConcat + '@' + stringArray[kc.d.f6207b.f().nextInt(length)], null, 15), 3);
                        return;
                    case 2:
                        x2 x2Var3 = this.f4887b;
                        z2 z2Var2 = x2Var3.f4896h0;
                        if (z2Var2 == null) {
                            jc.i.i("adapter");
                            throw null;
                        }
                        if (z2Var2.h) {
                            x2Var3.b0();
                            return;
                        }
                        z2Var2.k(true);
                        Button button3 = x2Var3.f4897i0;
                        if (button3 == null) {
                            jc.i.i("btnClearHistory");
                            throw null;
                        }
                        button3.setVisibility(8);
                        View view3 = x2Var3.f4898j0;
                        if (view3 == null) {
                            jc.i.i("selectionBar");
                            throw null;
                        }
                        view3.setVisibility(0);
                        TextView textView2 = x2Var3.k0;
                        if (textView2 == null) {
                            jc.i.i("textSelectionInfo");
                            throw null;
                        }
                        textView2.setText(x2Var3.v(R.string.tmph_select_hint));
                        TextView textView3 = x2Var3.f4899l0;
                        if (textView3 != null) {
                            textView3.setEnabled(false);
                            return;
                        } else {
                            jc.i.i("btnDeleteSelected");
                            throw null;
                        }
                    case 3:
                        this.f4887b.b0();
                        return;
                    default:
                        x2 x2Var4 = this.f4887b;
                        z2 z2Var3 = x2Var4.f4896h0;
                        if (z2Var3 == null) {
                            jc.i.i("adapter");
                            throw null;
                        }
                        Set setQ0 = vb.i.q0(z2Var3.f4925g);
                        if (setQ0.isEmpty()) {
                            Toast.makeText(x2Var4.U(), x2Var4.v(R.string.tmph_select_none), 0).show();
                            return;
                        }
                        List listN0 = vb.i.n0(setQ0);
                        ea.j jVar = new ea.j(x2Var4.U(), R.style.MyDialogTheme);
                        String strV = x2Var4.v(R.string.tmph_delete_confirm_title);
                        g.b bVar3 = (g.b) jVar.f3530b;
                        bVar3.f3971d = strV;
                        bVar3.f3972f = x2Var4.w(R.string.tmph_delete_confirm_message, Integer.valueOf(listN0.size()));
                        jVar.k(x2Var4.v(R.string.tmph_delete_selected), new e(2, x2Var4, listN0));
                        jVar.h(x2Var4.v(R.string.btn_cancel), null);
                        g.f fVarA = jVar.a();
                        fVarA.setOnShowListener(new f(fVarA, 4));
                        fVarA.show();
                        return;
                }
            }
        });
        Button button3 = this.f4897i0;
        if (button3 == null) {
            jc.i.i("btnClearHistory");
            throw null;
        }
        final int i11 = 2;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: h3.w2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x2 f4887b;

            {
                this.f4887b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String string;
                switch (i11) {
                    case 0:
                        x2 x2Var = this.f4887b;
                        if (!x2Var.U().getSharedPreferences("app_settings", 0).getBoolean("is_premium_cached", false)) {
                            androidx.fragment.app.i0 i0VarT = x2Var.t();
                            androidx.fragment.app.s sVarY = i0VarT.y("SubscriptionDialog");
                            m3.b bVar = sVarY instanceof m3.b ? (m3.b) sVarY : null;
                            if (bVar == null || !bVar.y()) {
                                m3.b bVar2 = new m3.b();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("arg_reason", "custom_email");
                                bVar2.Y(bundle2);
                                bVar2.e0(i0VarT, "SubscriptionDialog");
                                return;
                            }
                            return;
                        }
                        TextInputEditText textInputEditText = x2Var.f4894f0;
                        if (textInputEditText == null) {
                            jc.i.i("editUsername");
                            throw null;
                        }
                        Editable text = textInputEditText.getText();
                        String string2 = (text == null || (string = text.toString()) == null) ? null : pc.g.B0(string).toString();
                        if (string2 == null) {
                            string2 = "";
                        }
                        Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9._-]{3,30}$");
                        jc.i.d(patternCompile, "compile(...)");
                        if (!patternCompile.matcher(string2).matches()) {
                            Toast.makeText(x2Var.U(), x2Var.v(R.string.invalid_username), 0).show();
                            return;
                        }
                        Spinner spinner3 = x2Var.f4895g0;
                        if (spinner3 == null) {
                            jc.i.i("domainSpinner");
                            throw null;
                        }
                        rc.b0.q(androidx.lifecycle.i0.e(x2Var.x()), null, new a2.g(x2Var, string2 + '@' + spinner3.getSelectedItem().toString(), null, 15), 3);
                        return;
                    case 1:
                        String string3 = UUID.randomUUID().toString();
                        jc.i.d(string3, "toString(...)");
                        String strConcat = "user".concat(pc.g.A0(8, string3));
                        x2 x2Var2 = this.f4887b;
                        String[] stringArray = x2Var2.u().getStringArray(R.array.catchmail_domain_array);
                        jc.i.d(stringArray, "getStringArray(...)");
                        kc.c cVar = kc.d.f6206a;
                        if (stringArray.length == 0) {
                            throw new NoSuchElementException("Array is empty.");
                        }
                        int length = stringArray.length;
                        cVar.getClass();
                        rc.b0.q(androidx.lifecycle.i0.e(x2Var2.x()), null, new a2.g(x2Var2, strConcat + '@' + stringArray[kc.d.f6207b.f().nextInt(length)], null, 15), 3);
                        return;
                    case 2:
                        x2 x2Var3 = this.f4887b;
                        z2 z2Var2 = x2Var3.f4896h0;
                        if (z2Var2 == null) {
                            jc.i.i("adapter");
                            throw null;
                        }
                        if (z2Var2.h) {
                            x2Var3.b0();
                            return;
                        }
                        z2Var2.k(true);
                        Button button4 = x2Var3.f4897i0;
                        if (button4 == null) {
                            jc.i.i("btnClearHistory");
                            throw null;
                        }
                        button4.setVisibility(8);
                        View view3 = x2Var3.f4898j0;
                        if (view3 == null) {
                            jc.i.i("selectionBar");
                            throw null;
                        }
                        view3.setVisibility(0);
                        TextView textView2 = x2Var3.k0;
                        if (textView2 == null) {
                            jc.i.i("textSelectionInfo");
                            throw null;
                        }
                        textView2.setText(x2Var3.v(R.string.tmph_select_hint));
                        TextView textView3 = x2Var3.f4899l0;
                        if (textView3 != null) {
                            textView3.setEnabled(false);
                            return;
                        } else {
                            jc.i.i("btnDeleteSelected");
                            throw null;
                        }
                    case 3:
                        this.f4887b.b0();
                        return;
                    default:
                        x2 x2Var4 = this.f4887b;
                        z2 z2Var3 = x2Var4.f4896h0;
                        if (z2Var3 == null) {
                            jc.i.i("adapter");
                            throw null;
                        }
                        Set setQ0 = vb.i.q0(z2Var3.f4925g);
                        if (setQ0.isEmpty()) {
                            Toast.makeText(x2Var4.U(), x2Var4.v(R.string.tmph_select_none), 0).show();
                            return;
                        }
                        List listN0 = vb.i.n0(setQ0);
                        ea.j jVar = new ea.j(x2Var4.U(), R.style.MyDialogTheme);
                        String strV = x2Var4.v(R.string.tmph_delete_confirm_title);
                        g.b bVar3 = (g.b) jVar.f3530b;
                        bVar3.f3971d = strV;
                        bVar3.f3972f = x2Var4.w(R.string.tmph_delete_confirm_message, Integer.valueOf(listN0.size()));
                        jVar.k(x2Var4.v(R.string.tmph_delete_selected), new e(2, x2Var4, listN0));
                        jVar.h(x2Var4.v(R.string.btn_cancel), null);
                        g.f fVarA = jVar.a();
                        fVarA.setOnShowListener(new f(fVarA, 4));
                        fVarA.show();
                        return;
                }
            }
        });
        final int i12 = 3;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: h3.w2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x2 f4887b;

            {
                this.f4887b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String string;
                switch (i12) {
                    case 0:
                        x2 x2Var = this.f4887b;
                        if (!x2Var.U().getSharedPreferences("app_settings", 0).getBoolean("is_premium_cached", false)) {
                            androidx.fragment.app.i0 i0VarT = x2Var.t();
                            androidx.fragment.app.s sVarY = i0VarT.y("SubscriptionDialog");
                            m3.b bVar = sVarY instanceof m3.b ? (m3.b) sVarY : null;
                            if (bVar == null || !bVar.y()) {
                                m3.b bVar2 = new m3.b();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("arg_reason", "custom_email");
                                bVar2.Y(bundle2);
                                bVar2.e0(i0VarT, "SubscriptionDialog");
                                return;
                            }
                            return;
                        }
                        TextInputEditText textInputEditText = x2Var.f4894f0;
                        if (textInputEditText == null) {
                            jc.i.i("editUsername");
                            throw null;
                        }
                        Editable text = textInputEditText.getText();
                        String string2 = (text == null || (string = text.toString()) == null) ? null : pc.g.B0(string).toString();
                        if (string2 == null) {
                            string2 = "";
                        }
                        Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9._-]{3,30}$");
                        jc.i.d(patternCompile, "compile(...)");
                        if (!patternCompile.matcher(string2).matches()) {
                            Toast.makeText(x2Var.U(), x2Var.v(R.string.invalid_username), 0).show();
                            return;
                        }
                        Spinner spinner3 = x2Var.f4895g0;
                        if (spinner3 == null) {
                            jc.i.i("domainSpinner");
                            throw null;
                        }
                        rc.b0.q(androidx.lifecycle.i0.e(x2Var.x()), null, new a2.g(x2Var, string2 + '@' + spinner3.getSelectedItem().toString(), null, 15), 3);
                        return;
                    case 1:
                        String string3 = UUID.randomUUID().toString();
                        jc.i.d(string3, "toString(...)");
                        String strConcat = "user".concat(pc.g.A0(8, string3));
                        x2 x2Var2 = this.f4887b;
                        String[] stringArray = x2Var2.u().getStringArray(R.array.catchmail_domain_array);
                        jc.i.d(stringArray, "getStringArray(...)");
                        kc.c cVar = kc.d.f6206a;
                        if (stringArray.length == 0) {
                            throw new NoSuchElementException("Array is empty.");
                        }
                        int length = stringArray.length;
                        cVar.getClass();
                        rc.b0.q(androidx.lifecycle.i0.e(x2Var2.x()), null, new a2.g(x2Var2, strConcat + '@' + stringArray[kc.d.f6207b.f().nextInt(length)], null, 15), 3);
                        return;
                    case 2:
                        x2 x2Var3 = this.f4887b;
                        z2 z2Var2 = x2Var3.f4896h0;
                        if (z2Var2 == null) {
                            jc.i.i("adapter");
                            throw null;
                        }
                        if (z2Var2.h) {
                            x2Var3.b0();
                            return;
                        }
                        z2Var2.k(true);
                        Button button4 = x2Var3.f4897i0;
                        if (button4 == null) {
                            jc.i.i("btnClearHistory");
                            throw null;
                        }
                        button4.setVisibility(8);
                        View view3 = x2Var3.f4898j0;
                        if (view3 == null) {
                            jc.i.i("selectionBar");
                            throw null;
                        }
                        view3.setVisibility(0);
                        TextView textView2 = x2Var3.k0;
                        if (textView2 == null) {
                            jc.i.i("textSelectionInfo");
                            throw null;
                        }
                        textView2.setText(x2Var3.v(R.string.tmph_select_hint));
                        TextView textView3 = x2Var3.f4899l0;
                        if (textView3 != null) {
                            textView3.setEnabled(false);
                            return;
                        } else {
                            jc.i.i("btnDeleteSelected");
                            throw null;
                        }
                    case 3:
                        this.f4887b.b0();
                        return;
                    default:
                        x2 x2Var4 = this.f4887b;
                        z2 z2Var3 = x2Var4.f4896h0;
                        if (z2Var3 == null) {
                            jc.i.i("adapter");
                            throw null;
                        }
                        Set setQ0 = vb.i.q0(z2Var3.f4925g);
                        if (setQ0.isEmpty()) {
                            Toast.makeText(x2Var4.U(), x2Var4.v(R.string.tmph_select_none), 0).show();
                            return;
                        }
                        List listN0 = vb.i.n0(setQ0);
                        ea.j jVar = new ea.j(x2Var4.U(), R.style.MyDialogTheme);
                        String strV = x2Var4.v(R.string.tmph_delete_confirm_title);
                        g.b bVar3 = (g.b) jVar.f3530b;
                        bVar3.f3971d = strV;
                        bVar3.f3972f = x2Var4.w(R.string.tmph_delete_confirm_message, Integer.valueOf(listN0.size()));
                        jVar.k(x2Var4.v(R.string.tmph_delete_selected), new e(2, x2Var4, listN0));
                        jVar.h(x2Var4.v(R.string.btn_cancel), null);
                        g.f fVarA = jVar.a();
                        fVarA.setOnShowListener(new f(fVarA, 4));
                        fVarA.show();
                        return;
                }
            }
        });
        TextView textView2 = this.f4899l0;
        if (textView2 == null) {
            jc.i.i("btnDeleteSelected");
            throw null;
        }
        final int i13 = 4;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: h3.w2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x2 f4887b;

            {
                this.f4887b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String string;
                switch (i13) {
                    case 0:
                        x2 x2Var = this.f4887b;
                        if (!x2Var.U().getSharedPreferences("app_settings", 0).getBoolean("is_premium_cached", false)) {
                            androidx.fragment.app.i0 i0VarT = x2Var.t();
                            androidx.fragment.app.s sVarY = i0VarT.y("SubscriptionDialog");
                            m3.b bVar = sVarY instanceof m3.b ? (m3.b) sVarY : null;
                            if (bVar == null || !bVar.y()) {
                                m3.b bVar2 = new m3.b();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("arg_reason", "custom_email");
                                bVar2.Y(bundle2);
                                bVar2.e0(i0VarT, "SubscriptionDialog");
                                return;
                            }
                            return;
                        }
                        TextInputEditText textInputEditText = x2Var.f4894f0;
                        if (textInputEditText == null) {
                            jc.i.i("editUsername");
                            throw null;
                        }
                        Editable text = textInputEditText.getText();
                        String string2 = (text == null || (string = text.toString()) == null) ? null : pc.g.B0(string).toString();
                        if (string2 == null) {
                            string2 = "";
                        }
                        Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9._-]{3,30}$");
                        jc.i.d(patternCompile, "compile(...)");
                        if (!patternCompile.matcher(string2).matches()) {
                            Toast.makeText(x2Var.U(), x2Var.v(R.string.invalid_username), 0).show();
                            return;
                        }
                        Spinner spinner3 = x2Var.f4895g0;
                        if (spinner3 == null) {
                            jc.i.i("domainSpinner");
                            throw null;
                        }
                        rc.b0.q(androidx.lifecycle.i0.e(x2Var.x()), null, new a2.g(x2Var, string2 + '@' + spinner3.getSelectedItem().toString(), null, 15), 3);
                        return;
                    case 1:
                        String string3 = UUID.randomUUID().toString();
                        jc.i.d(string3, "toString(...)");
                        String strConcat = "user".concat(pc.g.A0(8, string3));
                        x2 x2Var2 = this.f4887b;
                        String[] stringArray = x2Var2.u().getStringArray(R.array.catchmail_domain_array);
                        jc.i.d(stringArray, "getStringArray(...)");
                        kc.c cVar = kc.d.f6206a;
                        if (stringArray.length == 0) {
                            throw new NoSuchElementException("Array is empty.");
                        }
                        int length = stringArray.length;
                        cVar.getClass();
                        rc.b0.q(androidx.lifecycle.i0.e(x2Var2.x()), null, new a2.g(x2Var2, strConcat + '@' + stringArray[kc.d.f6207b.f().nextInt(length)], null, 15), 3);
                        return;
                    case 2:
                        x2 x2Var3 = this.f4887b;
                        z2 z2Var2 = x2Var3.f4896h0;
                        if (z2Var2 == null) {
                            jc.i.i("adapter");
                            throw null;
                        }
                        if (z2Var2.h) {
                            x2Var3.b0();
                            return;
                        }
                        z2Var2.k(true);
                        Button button4 = x2Var3.f4897i0;
                        if (button4 == null) {
                            jc.i.i("btnClearHistory");
                            throw null;
                        }
                        button4.setVisibility(8);
                        View view3 = x2Var3.f4898j0;
                        if (view3 == null) {
                            jc.i.i("selectionBar");
                            throw null;
                        }
                        view3.setVisibility(0);
                        TextView textView3 = x2Var3.k0;
                        if (textView3 == null) {
                            jc.i.i("textSelectionInfo");
                            throw null;
                        }
                        textView3.setText(x2Var3.v(R.string.tmph_select_hint));
                        TextView textView4 = x2Var3.f4899l0;
                        if (textView4 != null) {
                            textView4.setEnabled(false);
                            return;
                        } else {
                            jc.i.i("btnDeleteSelected");
                            throw null;
                        }
                    case 3:
                        this.f4887b.b0();
                        return;
                    default:
                        x2 x2Var4 = this.f4887b;
                        z2 z2Var3 = x2Var4.f4896h0;
                        if (z2Var3 == null) {
                            jc.i.i("adapter");
                            throw null;
                        }
                        Set setQ0 = vb.i.q0(z2Var3.f4925g);
                        if (setQ0.isEmpty()) {
                            Toast.makeText(x2Var4.U(), x2Var4.v(R.string.tmph_select_none), 0).show();
                            return;
                        }
                        List listN0 = vb.i.n0(setQ0);
                        ea.j jVar = new ea.j(x2Var4.U(), R.style.MyDialogTheme);
                        String strV = x2Var4.v(R.string.tmph_delete_confirm_title);
                        g.b bVar3 = (g.b) jVar.f3530b;
                        bVar3.f3971d = strV;
                        bVar3.f3972f = x2Var4.w(R.string.tmph_delete_confirm_message, Integer.valueOf(listN0.size()));
                        jVar.k(x2Var4.v(R.string.tmph_delete_selected), new e(2, x2Var4, listN0));
                        jVar.h(x2Var4.v(R.string.btn_cancel), null);
                        g.f fVarA = jVar.a();
                        fVarA.setOnShowListener(new f(fVarA, 4));
                        fVarA.show();
                        return;
                }
            }
        });
        rc.b0.q(androidx.lifecycle.i0.e(x()), null, new a2.x(this, dVar, 2), 3);
    }

    public final void b0() {
        z2 z2Var = this.f4896h0;
        if (z2Var == null) {
            jc.i.i("adapter");
            throw null;
        }
        z2Var.k(false);
        Button button = this.f4897i0;
        if (button == null) {
            jc.i.i("btnClearHistory");
            throw null;
        }
        button.setVisibility(0);
        View view = this.f4898j0;
        if (view != null) {
            view.setVisibility(8);
        } else {
            jc.i.i("selectionBar");
            throw null;
        }
    }
}

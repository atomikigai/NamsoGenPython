package m3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.emoji2.text.f;
import androidx.fragment.app.l;
import androidx.fragment.app.w;
import androidx.lifecycle.i0;
import app.namso_gen.spacehowen.R;
import app.namso_gen.spacehowen.SettingsActivity;
import com.android.billingclient.api.Purchase;
import com.bumptech.glide.manager.q;
import h6.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jc.i;
import o3.d;
import o3.e;
import o3.j;
import o3.k;
import o3.n;
import r7.g;
import rc.b0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends l implements n {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public a2.l f7048v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public o3.b f7049w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public k f7050x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f7051y0 = "general";

    public static j f0(k kVar) {
        ArrayList arrayList;
        j jVar = null;
        Object next = null;
        jVar = null;
        jVar = null;
        if (kVar != null && (arrayList = kVar.h) != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    ArrayList arrayList2 = ((j) next).f7505b.f5977a;
                    i.d(arrayList2, "getPricingPhaseList(...)");
                    o3.i iVar = (o3.i) vb.i.a0(arrayList2);
                    long j4 = iVar != null ? iVar.f7503b : Long.MAX_VALUE;
                    do {
                        Object next2 = it.next();
                        ArrayList arrayList3 = ((j) next2).f7505b.f5977a;
                        i.d(arrayList3, "getPricingPhaseList(...)");
                        o3.i iVar2 = (o3.i) vb.i.a0(arrayList3);
                        long j10 = iVar2 != null ? iVar2.f7503b : Long.MAX_VALUE;
                        if (j4 > j10) {
                            next = next2;
                            j4 = j10;
                        }
                    } while (it.hasNext());
                }
            }
            jVar = (j) next;
            if (jVar == null) {
                return (j) vb.i.a0(arrayList);
            }
        }
        return jVar;
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.s
    public final void C(Bundle bundle) {
        String string;
        super.C(bundle);
        d0();
        Bundle bundle2 = this.f977f;
        if (bundle2 == null || (string = bundle2.getString("arg_reason")) == null) {
            string = "general";
        }
        this.f7051y0 = string;
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_subscription_monthly, viewGroup, false);
        int i = R.id.btnLater;
        Button button = (Button) g.o(viewInflate, R.id.btnLater);
        if (button != null) {
            i = R.id.btnSubscribe;
            Button button2 = (Button) g.o(viewInflate, R.id.btnSubscribe);
            if (button2 != null) {
                i = R.id.tvDialogReason;
                TextView textView = (TextView) g.o(viewInflate, R.id.tvDialogReason);
                if (textView != null) {
                    i = R.id.tvDialogTitle;
                    if (((TextView) g.o(viewInflate, R.id.tvDialogTitle)) != null) {
                        i = R.id.tvLegal;
                        if (((TextView) g.o(viewInflate, R.id.tvLegal)) != null) {
                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                            this.f7048v0 = new a2.l(linearLayout, button, button2, textView);
                            i.d(linearLayout, "getRoot(...)");
                            return linearLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.s
    public final void F() {
        super.F();
        o3.b bVar = this.f7049w0;
        if (bVar != null) {
            bVar.v();
        }
        this.f7049w0 = null;
        this.f7048v0 = null;
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.s
    public final void K() {
        Window window;
        super.K();
        Dialog dialog = this.f923q0;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        DisplayMetrics displayMetrics = u().getDisplayMetrics();
        int i = (int) (((double) displayMetrics.widthPixels) * 0.92d);
        int i10 = (int) (440 * displayMetrics.density);
        if (i > i10) {
            i = i10;
        }
        window.setLayout(i, -2);
        window.setBackgroundDrawableResource(android.R.color.transparent);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    @Override // androidx.fragment.app.s
    public final void M(Bundle bundle, View view) {
        String strV;
        i.e(view, "view");
        a2.l lVar = this.f7048v0;
        i.b(lVar);
        TextView textView = (TextView) lVar.f45d;
        String str = this.f7051y0;
        int iHashCode = str.hashCode();
        if (iHashCode != -687324378) {
            if (iHashCode != -555433253) {
                if (iHashCode == 717300046 && str.equals("custom_email")) {
                    strV = v(R.string.sub_dialog_reason_custom_email);
                } else {
                    strV = v(R.string.sub_dialog_reason_general);
                }
            } else if (str.equals("free_proxy")) {
                strV = v(R.string.sub_dialog_reason_free_proxy);
            } else {
                strV = v(R.string.sub_dialog_reason_general);
            }
        } else if (str.equals("profiles_limit")) {
            strV = v(R.string.sub_dialog_reason_profiles);
        } else {
            strV = v(R.string.sub_dialog_reason_general);
        }
        textView.setText(strV);
        a2.l lVar2 = this.f7048v0;
        i.b(lVar2);
        final int i = 0;
        ((Button) lVar2.f43b).setOnClickListener(new View.OnClickListener(this) { // from class: m3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f7047b;

            {
                this.f7047b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        this.f7047b.b0(false, false);
                        return;
                    default:
                        b bVar = this.f7047b;
                        o3.b bVar2 = bVar.f7049w0;
                        k kVar = bVar.f7050x0;
                        if (bVar2 == null || !bVar2.L()) {
                            Toast.makeText(bVar.U(), bVar.v(R.string.error_billing_connection), 0).show();
                            bVar.g0();
                            return;
                        }
                        if (kVar == null) {
                            Toast.makeText(bVar.U(), bVar.v(R.string.error_no_monthly_details), 0).show();
                            bVar.h0();
                            return;
                        }
                        j jVarF0 = b.f0(kVar);
                        String str2 = jVarF0 != null ? jVarF0.f7504a : null;
                        if (str2 == null || str2.length() == 0) {
                            Toast.makeText(bVar.U(), bVar.v(R.string.error_no_valid_offer), 0).show();
                            return;
                        }
                        o0 o0Var = new o0(18, false);
                        o0Var.o(kVar);
                        if (TextUtils.isEmpty(str2)) {
                            throw new IllegalArgumentException("offerToken can not be empty");
                        }
                        o0Var.f5062c = str2;
                        d dVarC = o0Var.c();
                        o0 o0VarE = q.e();
                        o0VarE.f5061b = new ArrayList(jd.d.D(dVarC));
                        bVar2.w(bVar.T(), o0VarE.b());
                        return;
                }
            }
        });
        a2.l lVar3 = this.f7048v0;
        i.b(lVar3);
        final int i10 = 1;
        ((Button) lVar3.f44c).setOnClickListener(new View.OnClickListener(this) { // from class: m3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f7047b;

            {
                this.f7047b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        this.f7047b.b0(false, false);
                        return;
                    default:
                        b bVar = this.f7047b;
                        o3.b bVar2 = bVar.f7049w0;
                        k kVar = bVar.f7050x0;
                        if (bVar2 == null || !bVar2.L()) {
                            Toast.makeText(bVar.U(), bVar.v(R.string.error_billing_connection), 0).show();
                            bVar.g0();
                            return;
                        }
                        if (kVar == null) {
                            Toast.makeText(bVar.U(), bVar.v(R.string.error_no_monthly_details), 0).show();
                            bVar.h0();
                            return;
                        }
                        j jVarF0 = b.f0(kVar);
                        String str2 = jVarF0 != null ? jVarF0.f7504a : null;
                        if (str2 == null || str2.length() == 0) {
                            Toast.makeText(bVar.U(), bVar.v(R.string.error_no_valid_offer), 0).show();
                            return;
                        }
                        o0 o0Var = new o0(18, false);
                        o0Var.o(kVar);
                        if (TextUtils.isEmpty(str2)) {
                            throw new IllegalArgumentException("offerToken can not be empty");
                        }
                        o0Var.f5062c = str2;
                        d dVarC = o0Var.c();
                        o0 o0VarE = q.e();
                        o0VarE.f5061b = new ArrayList(jd.d.D(dVarC));
                        bVar2.w(bVar.T(), o0VarE.b());
                        return;
                }
            }
        });
        g0();
    }

    public final void g0() {
        f fVar = new f(U());
        fVar.f764c = this;
        fVar.f762a = new wa.d();
        o3.b bVarA = fVar.a();
        this.f7049w0 = bVarA;
        bVarA.z(new e7.i(this, 27));
    }

    public final void h0() {
        o3.b bVar = this.f7049w0;
        if (bVar == null) {
            return;
        }
        a5.g gVar = new a5.g();
        gVar.f199a = "monthly_subscription";
        gVar.f200b = "subs";
        List listD = jd.d.D(gVar.a());
        a5.b bVar2 = new a5.b(22);
        bVar2.z(listD);
        bVar.x(bVar2.d(), new a5.a(this, 21));
    }

    @Override // o3.n
    public final void j(e eVar, List list) {
        Context contextR;
        Context applicationContext;
        i.e(eVar, "billingResult");
        int i = eVar.f7495a;
        if (i != 0 || list == null) {
            if (i != 1) {
                Context contextU = U();
                String strV = eVar.f7497c;
                if (strV.length() == 0) {
                    strV = v(R.string.error_something_went_wrong);
                }
                Toast.makeText(contextU, strV, 0).show();
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            if (purchase.b() == 1 && purchase.a().contains("monthly_subscription") && (contextR = r()) != null && (applicationContext = contextR.getApplicationContext()) != null) {
                b0.q(i0.e(x()), null, new a2.e(purchase, applicationContext, this, null, 8), 3);
            }
        }
    }

    @Override // androidx.fragment.app.l, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        i.e(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        w wVarG = g();
        SettingsActivity settingsActivity = wVarG instanceof SettingsActivity ? (SettingsActivity) wVarG : null;
        if (settingsActivity != null) {
            settingsActivity.C();
        }
    }
}

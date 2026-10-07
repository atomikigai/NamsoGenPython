package l3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.R;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import h3.g2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends androidx.fragment.app.l implements o3.n {
    public g2 C0;
    public int D0;
    public boolean E0;
    public String F0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public c3.j f6737v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public b0 f6738w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public FirebaseAuth f6739x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public o3.b f6740y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public o3.k f6741z0;
    public final ArrayList A0 = new ArrayList();
    public final ArrayList B0 = new ArrayList();
    public final LinkedHashSet G0 = new LinkedHashSet();
    public final androidx.fragment.app.o H0 = (androidx.fragment.app.o) S(new u(this), new androidx.fragment.app.e0(5));

    public static final void f0(y yVar, String str) {
        ArrayList arrayList = yVar.A0;
        String lowerCase = pc.g.B0(str).toString().toLowerCase(Locale.ROOT);
        jc.i.d(lowerCase, "toLowerCase(...)");
        ArrayList arrayList2 = yVar.B0;
        arrayList2.clear();
        if (lowerCase.length() == 0) {
            arrayList2.addAll(arrayList);
        } else {
            Iterator it = arrayList.iterator();
            jc.i.d(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                jc.i.d(next, "next(...)");
                k3.m mVar = (k3.m) next;
                String str2 = mVar.f5956b;
                Locale locale = Locale.ROOT;
                String lowerCase2 = str2.toLowerCase(locale);
                jc.i.d(lowerCase2, "toLowerCase(...)");
                if (!pc.g.f0(lowerCase2, lowerCase, false)) {
                    String lowerCase3 = mVar.f5955a.toLowerCase(locale);
                    jc.i.d(lowerCase3, "toLowerCase(...)");
                    if (pc.g.f0(lowerCase3, lowerCase, false)) {
                    }
                }
                arrayList2.add(mVar);
            }
        }
        c3.j jVar = yVar.f6737v0;
        jc.i.b(jVar);
        ((TextView) jVar.h).setVisibility((!arrayList2.isEmpty() || arrayList.isEmpty()) ? 8 : 0);
        g2 g2Var = yVar.C0;
        if (g2Var != null) {
            g2Var.c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g0(y yVar, ac.c cVar) {
        x xVar;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i = xVar.f6736c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xVar.f6736c = i - Integer.MIN_VALUE;
            } else {
                xVar = new x(yVar, cVar);
            }
        } else {
            xVar = new x(yVar, cVar);
        }
        Object objF = xVar.f6734a;
        zb.a aVar = zb.a.f11555a;
        int i10 = xVar.f6736c;
        try {
            if (i10 == 0) {
                r7.g.G(objF);
                FirebaseAuth firebaseAuth = yVar.f6739x0;
                if (firebaseAuth == null) {
                    jc.i.i("auth");
                    throw null;
                }
                v9.n nVar = firebaseAuth.f2702f;
                if (nVar != null) {
                    Task taskG = nVar.g();
                    jc.i.d(taskG, "getIdToken(...)");
                    xVar.f6736c = 1;
                    objF = fa.c1.f(taskG, xVar);
                    if (objF == aVar) {
                        return aVar;
                    }
                }
                return null;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r7.g.G(objF);
            v9.o oVar = (v9.o) objF;
            if (oVar != null) {
                return oVar.f9272a;
            }
            return null;
        } catch (Exception e) {
            Log.e("PremiumDialog", "Error obteniendo id_token: " + e.getMessage());
            return null;
        }
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.s
    public final void C(Bundle bundle) {
        super.C(bundle);
        d0();
        this.f6739x0 = FirebaseAuth.getInstance();
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_premium_proxy, viewGroup, false);
        int i = R.id.btn_buy_mb;
        TextView textView = (TextView) r7.g.o(viewInflate, R.id.btn_buy_mb);
        if (textView != null) {
            i = R.id.btn_close_dialog;
            TextView textView2 = (TextView) r7.g.o(viewInflate, R.id.btn_close_dialog);
            if (textView2 != null) {
                i = R.id.et_search_country;
                EditText editText = (EditText) r7.g.o(viewInflate, R.id.et_search_country);
                if (editText != null) {
                    i = R.id.pb_loading;
                    ProgressBar progressBar = (ProgressBar) r7.g.o(viewInflate, R.id.pb_loading);
                    if (progressBar != null) {
                        i = R.id.rv_countries;
                        RecyclerView recyclerView = (RecyclerView) r7.g.o(viewInflate, R.id.rv_countries);
                        if (recyclerView != null) {
                            i = R.id.tv_mb_balance;
                            TextView textView3 = (TextView) r7.g.o(viewInflate, R.id.tv_mb_balance);
                            if (textView3 != null) {
                                i = R.id.tv_mb_expires;
                                TextView textView4 = (TextView) r7.g.o(viewInflate, R.id.tv_mb_expires);
                                if (textView4 != null) {
                                    i = R.id.tv_no_country;
                                    TextView textView5 = (TextView) r7.g.o(viewInflate, R.id.tv_no_country);
                                    if (textView5 != null) {
                                        i = R.id.tv_title;
                                        if (((TextView) r7.g.o(viewInflate, R.id.tv_title)) != null) {
                                            i = R.id.tv_user_email;
                                            TextView textView6 = (TextView) r7.g.o(viewInflate, R.id.tv_user_email);
                                            if (textView6 != null) {
                                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                this.f6737v0 = new c3.j(linearLayout, textView, textView2, editText, progressBar, recyclerView, textView3, textView4, textView5, textView6);
                                                jc.i.d(linearLayout, "getRoot(...)");
                                                return linearLayout;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.s
    public final void E() {
        this.N = true;
        o3.b bVar = this.f6740y0;
        if (bVar != null) {
            bVar.v();
        }
        this.f6740y0 = null;
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.s
    public final void F() {
        super.F();
        this.f6737v0 = null;
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.s
    public final void K() {
        Window window;
        super.K();
        Dialog dialog = this.f923q0;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawableResource(android.R.color.transparent);
        window.setLayout((int) (((double) u().getDisplayMetrics().widthPixels) * 0.94d), -2);
    }

    @Override // androidx.fragment.app.s
    public final void M(Bundle bundle, View view) {
        jc.i.e(view, "view");
        c3.j jVar = this.f6737v0;
        jc.i.b(jVar);
        final int i = 0;
        ((TextView) jVar.f1760b).setOnClickListener(new View.OnClickListener(this) { // from class: l3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f6713b;

            {
                this.f6713b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        this.f6713b.b0(false, false);
                        break;
                    default:
                        this.f6713b.j0();
                        break;
                }
            }
        });
        c3.j jVar2 = this.f6737v0;
        jc.i.b(jVar2);
        final int i10 = 1;
        ((TextView) jVar2.f1759a).setOnClickListener(new View.OnClickListener(this) { // from class: l3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f6713b;

            {
                this.f6713b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        this.f6713b.b0(false, false);
                        break;
                    default:
                        this.f6713b.j0();
                        break;
                }
            }
        });
        this.C0 = new g2(this, this.B0, new h3.c(this, 4));
        c3.j jVar3 = this.f6737v0;
        jc.i.b(jVar3);
        RecyclerView recyclerView = (RecyclerView) jVar3.e;
        U();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        c3.j jVar4 = this.f6737v0;
        jc.i.b(jVar4);
        ((RecyclerView) jVar4.e).setAdapter(this.C0);
        c3.j jVar5 = this.f6737v0;
        jc.i.b(jVar5);
        ((EditText) jVar5.f1761c).addTextChangedListener(new g9.z(this, 3));
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(U());
        fVar.f764c = this;
        fVar.f762a = new wa.d();
        o3.b bVarA = fVar.a();
        this.f6740y0 = bVarA;
        bVarA.z(new e7.i(this, 26));
        FirebaseAuth firebaseAuth = this.f6739x0;
        if (firebaseAuth == null) {
            jc.i.i("auth");
            throw null;
        }
        if (firebaseAuth.f2702f == null) {
            k0();
        } else {
            i0();
        }
    }

    public final void h0(Purchase purchase) {
        Context context;
        String strC = purchase.c();
        jc.i.d(strC, "getPurchaseToken(...)");
        if (this.G0.add(strC)) {
            Context contextR = r();
            yb.d dVar = null;
            if (contextR == null || (applicationContext = contextR.getApplicationContext()) == null) {
                androidx.fragment.app.w wVarG = g();
                if (wVarG != null) {
                    Context applicationContext = wVarG.getApplicationContext();
                    context = applicationContext;
                } else {
                    context = null;
                }
            } else {
                context = applicationContext;
            }
            rc.b0.q(androidx.lifecycle.i0.e(this), null, new a2.e(this, purchase, context, dVar, 7), 3);
        }
    }

    public final void i0() {
        FirebaseAuth firebaseAuth = this.f6739x0;
        yb.d dVar = null;
        if (firebaseAuth == null) {
            jc.i.i("auth");
            throw null;
        }
        v9.n nVar = firebaseAuth.f2702f;
        if (nVar == null) {
            k0();
            return;
        }
        c3.j jVar = this.f6737v0;
        jc.i.b(jVar);
        TextView textView = (TextView) jVar.i;
        w9.b0 b0Var = ((w9.d0) nVar).f9820b;
        String str = b0Var.f9810f;
        if (str == null) {
            str = b0Var.f9806a;
            jc.i.d(str, "getUid(...)");
        }
        textView.setText(str);
        rc.b0.q(androidx.lifecycle.i0.e(x()), null, new a2.x(this, dVar, 3), 3);
    }

    @Override // o3.n
    public final void j(o3.e eVar, List list) {
        jc.i.e(eVar, "billingResult");
        int i = eVar.f7495a;
        if (i == 0 && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                if (purchase.b() == 1 && purchase.a().contains("proxy_100_mb")) {
                    h0(purchase);
                }
            }
            return;
        }
        if (i == 7) {
            l0();
            return;
        }
        if (i == 1) {
            Context contextR = r();
            if (contextR != null) {
                Toast.makeText(contextR, v(R.string.purchase_cancelled), 0).show();
                return;
            }
            return;
        }
        Context contextR2 = r();
        if (contextR2 != null) {
            Toast.makeText(contextR2, w(R.string.purchase_error, eVar.f7497c), 0).show();
        }
    }

    public final void j0() {
        FirebaseAuth firebaseAuth = this.f6739x0;
        if (firebaseAuth == null) {
            jc.i.i("auth");
            throw null;
        }
        if (firebaseAuth.f2702f == null) {
            k0();
            return;
        }
        o3.k kVar = this.f6741z0;
        o3.b bVar = this.f6740y0;
        if (kVar == null || bVar == null) {
            Toast.makeText(U(), v(R.string.error_product_details), 0).show();
            m0();
            return;
        }
        h6.o0 o0VarE = com.bumptech.glide.manager.q.e();
        h6.o0 o0Var = new h6.o0(18, false);
        o0Var.o(kVar);
        o0VarE.f5061b = new ArrayList(jd.d.D(o0Var.c()));
        o3.e eVarW = bVar.w(T(), o0VarE.b());
        jc.i.d(eVarW, "launchBillingFlow(...)");
        if (eVarW.f7495a == 7) {
            l0();
        }
    }

    public final void k0() {
        ArrayList arrayListQ = vb.j.Q(new h6.o0(29).d());
        r4.d dVar = new r4.d(r4.e.a(n9.g.d()));
        dVar.b(arrayListQ);
        dVar.f8150d = false;
        dVar.e = false;
        this.H0.a(dVar.a());
    }

    public final void l0() {
        o3.b bVar = this.f6740y0;
        if (bVar != null && bVar.L()) {
            i6.e eVar = new i6.e(2);
            eVar.f5226b = "inapp";
            bVar.y(eVar.a(), new u(this));
        }
    }

    public final void m0() {
        a5.g gVar = new a5.g();
        gVar.f199a = "proxy_100_mb";
        gVar.f200b = "inapp";
        List listD = jd.d.D(gVar.a());
        a5.b bVar = new a5.b(22);
        bVar.z(listD);
        a4.b bVarD = bVar.d();
        o3.b bVar2 = this.f6740y0;
        if (bVar2 != null) {
            bVar2.x(bVarD, new u(this));
        }
    }

    @Override // androidx.fragment.app.l, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        jc.i.e(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        androidx.fragment.app.w wVarG = g();
        MainActivity mainActivity = wVarG instanceof MainActivity ? (MainActivity) wVarG : null;
        if (mainActivity != null) {
            mainActivity.x();
        }
    }
}

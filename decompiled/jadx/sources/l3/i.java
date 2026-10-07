package l3;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends androidx.fragment.app.l {
    public h3.n B0;
    public d C0;
    public ExecutorService D0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public j3.a f6570v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public b0 f6571w0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public h3.n f6574z0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final ArrayList f6572x0 = new ArrayList();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final ArrayList f6573y0 = new ArrayList();
    public final ArrayList A0 = new ArrayList();
    public final AtomicBoolean E0 = new AtomicBoolean(false);

    @Override // androidx.fragment.app.l, androidx.fragment.app.s
    public final void C(Bundle bundle) {
        super.C(bundle);
        d0();
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_free_proxy, viewGroup, false);
        int i = R.id.btn_change_country;
        TextView textView = (TextView) r7.g.o(viewInflate, R.id.btn_change_country);
        if (textView != null) {
            i = R.id.btn_close_dialog;
            TextView textView2 = (TextView) r7.g.o(viewInflate, R.id.btn_close_dialog);
            if (textView2 != null) {
                i = R.id.btn_retry_test;
                TextView textView3 = (TextView) r7.g.o(viewInflate, R.id.btn_retry_test);
                if (textView3 != null) {
                    i = R.id.et_search_country;
                    EditText editText = (EditText) r7.g.o(viewInflate, R.id.et_search_country);
                    if (editText != null) {
                        i = R.id.ll_country_picker;
                        LinearLayout linearLayout = (LinearLayout) r7.g.o(viewInflate, R.id.ll_country_picker);
                        if (linearLayout != null) {
                            i = R.id.ll_no_results;
                            LinearLayout linearLayout2 = (LinearLayout) r7.g.o(viewInflate, R.id.ll_no_results);
                            if (linearLayout2 != null) {
                                i = R.id.ll_testing_view;
                                LinearLayout linearLayout3 = (LinearLayout) r7.g.o(viewInflate, R.id.ll_testing_view);
                                if (linearLayout3 != null) {
                                    i = R.id.pb_testing;
                                    ProgressBar progressBar = (ProgressBar) r7.g.o(viewInflate, R.id.pb_testing);
                                    if (progressBar != null) {
                                        i = R.id.rv_alive_proxies;
                                        RecyclerView recyclerView = (RecyclerView) r7.g.o(viewInflate, R.id.rv_alive_proxies);
                                        if (recyclerView != null) {
                                            i = R.id.rv_countries;
                                            RecyclerView recyclerView2 = (RecyclerView) r7.g.o(viewInflate, R.id.rv_countries);
                                            if (recyclerView2 != null) {
                                                i = R.id.tv_no_country_match;
                                                TextView textView4 = (TextView) r7.g.o(viewInflate, R.id.tv_no_country_match);
                                                if (textView4 != null) {
                                                    i = R.id.tv_no_results;
                                                    if (((TextView) r7.g.o(viewInflate, R.id.tv_no_results)) != null) {
                                                        i = R.id.tv_selected_country;
                                                        TextView textView5 = (TextView) r7.g.o(viewInflate, R.id.tv_selected_country);
                                                        if (textView5 != null) {
                                                            i = R.id.tv_subtitle;
                                                            if (((TextView) r7.g.o(viewInflate, R.id.tv_subtitle)) != null) {
                                                                i = R.id.tv_testing_status;
                                                                TextView textView6 = (TextView) r7.g.o(viewInflate, R.id.tv_testing_status);
                                                                if (textView6 != null) {
                                                                    i = R.id.tv_title;
                                                                    if (((TextView) r7.g.o(viewInflate, R.id.tv_title)) != null) {
                                                                        LinearLayout linearLayout4 = (LinearLayout) viewInflate;
                                                                        this.f6570v0 = new j3.a(linearLayout4, textView, textView2, textView3, editText, linearLayout, linearLayout2, linearLayout3, progressBar, recyclerView, recyclerView2, textView4, textView5, textView6);
                                                                        jc.i.d(linearLayout4, "getRoot(...)");
                                                                        return linearLayout4;
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
                            }
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
        f0();
        this.f6570v0 = null;
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
        j3.a aVar = this.f6570v0;
        jc.i.b(aVar);
        final int i = 0;
        aVar.f5643b.setOnClickListener(new View.OnClickListener(this) { // from class: l3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f6512b;

            {
                this.f6512b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        i iVar = this.f6512b;
                        iVar.f0();
                        iVar.b0(false, false);
                        break;
                    case 1:
                        i iVar2 = this.f6512b;
                        iVar2.f0();
                        j3.a aVar2 = iVar2.f6570v0;
                        jc.i.b(aVar2);
                        aVar2.f5647g.setVisibility(8);
                        j3.a aVar3 = iVar2.f6570v0;
                        jc.i.b(aVar3);
                        aVar3.e.setVisibility(0);
                        break;
                    default:
                        i iVar3 = this.f6512b;
                        d dVar = iVar3.C0;
                        if (dVar != null) {
                            iVar3.h0(dVar);
                        }
                        break;
                }
            }
        });
        j3.a aVar2 = this.f6570v0;
        jc.i.b(aVar2);
        final int i10 = 1;
        aVar2.f5642a.setOnClickListener(new View.OnClickListener(this) { // from class: l3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f6512b;

            {
                this.f6512b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        i iVar = this.f6512b;
                        iVar.f0();
                        iVar.b0(false, false);
                        break;
                    case 1:
                        i iVar2 = this.f6512b;
                        iVar2.f0();
                        j3.a aVar3 = iVar2.f6570v0;
                        jc.i.b(aVar3);
                        aVar3.f5647g.setVisibility(8);
                        j3.a aVar4 = iVar2.f6570v0;
                        jc.i.b(aVar4);
                        aVar4.e.setVisibility(0);
                        break;
                    default:
                        i iVar3 = this.f6512b;
                        d dVar = iVar3.C0;
                        if (dVar != null) {
                            iVar3.h0(dVar);
                        }
                        break;
                }
            }
        });
        j3.a aVar3 = this.f6570v0;
        jc.i.b(aVar3);
        final int i11 = 2;
        aVar3.f5644c.setOnClickListener(new View.OnClickListener(this) { // from class: l3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f6512b;

            {
                this.f6512b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        i iVar = this.f6512b;
                        iVar.f0();
                        iVar.b0(false, false);
                        break;
                    case 1:
                        i iVar2 = this.f6512b;
                        iVar2.f0();
                        j3.a aVar4 = iVar2.f6570v0;
                        jc.i.b(aVar4);
                        aVar4.f5647g.setVisibility(8);
                        j3.a aVar5 = iVar2.f6570v0;
                        jc.i.b(aVar5);
                        aVar5.e.setVisibility(0);
                        break;
                    default:
                        i iVar3 = this.f6512b;
                        d dVar = iVar3.C0;
                        if (dVar != null) {
                            iVar3.h0(dVar);
                        }
                        break;
                }
            }
        });
        this.f6574z0 = new h3.n(this.f6573y0, new b(this, 1), (byte) 0);
        j3.a aVar4 = this.f6570v0;
        jc.i.b(aVar4);
        RecyclerView recyclerView = aVar4.f5648j;
        U();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        j3.a aVar5 = this.f6570v0;
        jc.i.b(aVar5);
        aVar5.f5648j.setAdapter(this.f6574z0);
        this.B0 = new h3.n(this.A0, new b(this, 0));
        j3.a aVar6 = this.f6570v0;
        jc.i.b(aVar6);
        RecyclerView recyclerView2 = aVar6.i;
        U();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        j3.a aVar7 = this.f6570v0;
        jc.i.b(aVar7);
        aVar7.i.setAdapter(this.B0);
        j3.a aVar8 = this.f6570v0;
        jc.i.b(aVar8);
        aVar8.f5645d.addTextChangedListener(new g9.z(this, 2));
        List listS = vb.j.S("PE", "AR", "CO", "MX", "CL", "ES", "US", "BR", "EC", "BO", "VE", "UY", "PY", "GB", "DE", "FR", "IT", "PT", "CA", "JP", "PA", "CR", "GT", "SV", "HN", "NI", "DO", "CU", "NL", "IN", "TR", "RU");
        ArrayList arrayList = this.f6572x0;
        arrayList.clear();
        HashSet hashSet = new HashSet();
        Locale locale = Locale.getDefault();
        Iterator it = listS.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            Locale locale2 = new Locale("", str);
            String displayCountry = locale2.getDisplayCountry(locale);
            if (displayCountry.length() == 0) {
                displayCountry = locale2.getDisplayCountry();
            }
            jc.i.b(displayCountry);
            arrayList.add(new d(str, displayCountry, n3.d.a(str)));
            hashSet.add(str);
        }
        ArrayList arrayList2 = new ArrayList();
        jc.a aVarC = jc.t.c(Locale.getISOCountries());
        while (aVarC.hasNext()) {
            String str2 = (String) aVarC.next();
            if (hashSet.add(str2)) {
                Locale locale3 = new Locale("", str2);
                String displayCountry2 = locale3.getDisplayCountry(locale);
                if (displayCountry2.length() == 0) {
                    displayCountry2 = locale3.getDisplayCountry();
                }
                jc.i.b(displayCountry2);
                if (!pc.g.m0(displayCountry2)) {
                    jc.i.b(str2);
                    arrayList2.add(new d(str2, displayCountry2, n3.d.a(str2)));
                }
            }
        }
        if (arrayList2.size() > 1) {
            vb.n.V(arrayList2, new b0.h(7));
        }
        arrayList.addAll(arrayList2);
        j3.a aVar9 = this.f6570v0;
        jc.i.b(aVar9);
        Editable text = aVar9.f5645d.getText();
        String string = text != null ? text.toString() : null;
        g0(string != null ? string : "");
    }

    public final void f0() {
        this.E0.set(true);
        ExecutorService executorService = this.D0;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        this.D0 = null;
    }

    public final void g0(String str) {
        String lowerCase = pc.g.B0(str).toString().toLowerCase(Locale.ROOT);
        jc.i.d(lowerCase, "toLowerCase(...)");
        ArrayList arrayList = this.f6573y0;
        arrayList.clear();
        int length = lowerCase.length();
        ArrayList arrayList2 = this.f6572x0;
        if (length == 0) {
            arrayList.addAll(arrayList2);
        } else {
            Iterator it = arrayList2.iterator();
            jc.i.d(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                jc.i.d(next, "next(...)");
                d dVar = (d) next;
                String str2 = dVar.f6539b;
                Locale locale = Locale.ROOT;
                String lowerCase2 = str2.toLowerCase(locale);
                jc.i.d(lowerCase2, "toLowerCase(...)");
                if (!pc.g.f0(lowerCase2, lowerCase, false)) {
                    String lowerCase3 = dVar.f6538a.toLowerCase(locale);
                    jc.i.d(lowerCase3, "toLowerCase(...)");
                    if (pc.g.f0(lowerCase3, lowerCase, false)) {
                    }
                }
                arrayList.add(dVar);
            }
        }
        h3.n nVar = this.f6574z0;
        if (nVar != null) {
            nVar.c();
        }
        j3.a aVar = this.f6570v0;
        jc.i.b(aVar);
        aVar.f5649k.setVisibility(arrayList.isEmpty() ? 0 : 8);
    }

    public final void h0(d dVar) {
        this.C0 = dVar;
        f0();
        this.E0.set(false);
        j3.a aVar = this.f6570v0;
        jc.i.b(aVar);
        aVar.e.setVisibility(8);
        j3.a aVar2 = this.f6570v0;
        jc.i.b(aVar2);
        aVar2.f5647g.setVisibility(0);
        j3.a aVar3 = this.f6570v0;
        jc.i.b(aVar3);
        TextView textView = aVar3.f5650l;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVar.f6540c);
        sb2.append(' ');
        String str = dVar.f6539b;
        sb2.append(str);
        sb2.append(" (");
        sb2.append(dVar.f6538a);
        sb2.append(')');
        textView.setText(sb2.toString());
        j3.a aVar4 = this.f6570v0;
        jc.i.b(aVar4);
        aVar4.h.setVisibility(0);
        j3.a aVar5 = this.f6570v0;
        jc.i.b(aVar5);
        aVar5.h.setIndeterminate(true);
        j3.a aVar6 = this.f6570v0;
        jc.i.b(aVar6);
        aVar6.f5651m.setVisibility(0);
        j3.a aVar7 = this.f6570v0;
        jc.i.b(aVar7);
        aVar7.f5651m.setText(w(R.string.free_proxy_searching_sources, str));
        j3.a aVar8 = this.f6570v0;
        jc.i.b(aVar8);
        aVar8.i.setVisibility(8);
        j3.a aVar9 = this.f6570v0;
        jc.i.b(aVar9);
        aVar9.f5646f.setVisibility(8);
        this.A0.clear();
        h3.n nVar = this.B0;
        if (nVar != null) {
            nVar.c();
        }
        rc.b0.q(androidx.lifecycle.i0.e(x()), null, new a2.g(this, dVar, null, 17), 3);
    }
}

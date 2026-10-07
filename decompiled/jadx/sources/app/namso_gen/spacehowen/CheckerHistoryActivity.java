package app.namso_gen.spacehowen;

import a.a;
import a2.d;
import a2.l;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.o;
import androidx.lifecycle.i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.namso_gen.spacehowen.CheckerHistoryActivity;
import app.namso_gen.spacehowen.R;
import com.google.android.material.tabs.TabLayout;
import g.g;
import h3.c;
import h3.n;
import i3.e;
import java.util.ArrayList;
import rc.b0;
import rc.q1;
import ub.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class CheckerHistoryActivity extends g {
    public static final /* synthetic */ int Q = 0;
    public RecyclerView K;
    public TextView L;
    public TabLayout M;
    public n N;
    public final i O = new i(new d(this, 2));
    public q1 P;

    @Override // androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o.a(this);
        setContentView(R.layout.activity_checker_history);
        this.K = (RecyclerView) findViewById(R.id.recyclerCheckerHistory);
        this.L = (TextView) findViewById(R.id.textCheckerHistoryEmpty);
        this.M = (TabLayout) findViewById(R.id.tabLayoutHistory);
        this.N = new n(new c(this, 0));
        RecyclerView recyclerView = this.K;
        if (recyclerView == null) {
            jc.i.i("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        RecyclerView recyclerView2 = this.K;
        if (recyclerView2 == null) {
            jc.i.i("recyclerView");
            throw null;
        }
        n nVar = this.N;
        if (nVar == null) {
            jc.i.i("adapter");
            throw null;
        }
        recyclerView2.setAdapter(nVar);
        final int i = 0;
        ((ImageView) findViewById(R.id.btnBack)).setOnClickListener(new View.OnClickListener(this) { // from class: h3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckerHistoryActivity f4654b;

            {
                this.f4654b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = i;
                CheckerHistoryActivity checkerHistoryActivity = this.f4654b;
                switch (i10) {
                    case 0:
                        int i11 = CheckerHistoryActivity.Q;
                        checkerHistoryActivity.finish();
                        return;
                    default:
                        TabLayout tabLayout = checkerHistoryActivity.M;
                        if (tabLayout == null) {
                            jc.i.i("tabLayout");
                            throw null;
                        }
                        int selectedTabPosition = tabLayout.getSelectedTabPosition();
                        ea.j jVar = new ea.j((Context) checkerHistoryActivity, R.style.MyDialogTheme);
                        g.b bVar = (g.b) jVar.f3530b;
                        bVar.f3971d = checkerHistoryActivity.getString(R.string.ldc_history_clear_confirm_title);
                        bVar.f3972f = checkerHistoryActivity.getString(R.string.ldc_history_clear_confirm_message);
                        jVar.k(checkerHistoryActivity.getString(R.string.ldc_history_clear), new g(checkerHistoryActivity, selectedTabPosition, 0));
                        jVar.h(checkerHistoryActivity.getString(R.string.btn_cancel), null);
                        g.f fVarA = jVar.a();
                        fVarA.setOnShowListener(new f(fVarA, 1));
                        fVarA.show();
                        return;
                }
            }
        });
        final int i10 = 1;
        ((TextView) findViewById(R.id.btnClearHistory)).setOnClickListener(new View.OnClickListener(this) { // from class: h3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckerHistoryActivity f4654b;

            {
                this.f4654b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                CheckerHistoryActivity checkerHistoryActivity = this.f4654b;
                switch (i11) {
                    case 0:
                        int i12 = CheckerHistoryActivity.Q;
                        checkerHistoryActivity.finish();
                        return;
                    default:
                        TabLayout tabLayout = checkerHistoryActivity.M;
                        if (tabLayout == null) {
                            jc.i.i("tabLayout");
                            throw null;
                        }
                        int selectedTabPosition = tabLayout.getSelectedTabPosition();
                        ea.j jVar = new ea.j((Context) checkerHistoryActivity, R.style.MyDialogTheme);
                        g.b bVar = (g.b) jVar.f3530b;
                        bVar.f3971d = checkerHistoryActivity.getString(R.string.ldc_history_clear_confirm_title);
                        bVar.f3972f = checkerHistoryActivity.getString(R.string.ldc_history_clear_confirm_message);
                        jVar.k(checkerHistoryActivity.getString(R.string.ldc_history_clear), new g(checkerHistoryActivity, selectedTabPosition, 0));
                        jVar.h(checkerHistoryActivity.getString(R.string.btn_cancel), null);
                        g.f fVarA = jVar.a();
                        fVarA.setOnShowListener(new f(fVarA, 1));
                        fVarA.show();
                        return;
                }
            }
        });
        TabLayout tabLayout = this.M;
        if (tabLayout == null) {
            jc.i.i("tabLayout");
            throw null;
        }
        h3.i iVar = new h3.i(this);
        ArrayList arrayList = tabLayout.W;
        if (!arrayList.contains(iVar)) {
            arrayList.add(iVar);
        }
        u(0);
    }

    public final e t() {
        return (e) this.O.getValue();
    }

    public final void u(int i) {
        e eVarT = t();
        l lVarD = i == 0 ? a.d(eVarT.f5167a, new String[]{"checker_batches"}, new h3.o(1)) : a.d(eVarT.f5167a, new String[]{"checker_batches"}, new h3.o(2));
        TextView textView = this.L;
        yb.d dVar = null;
        if (textView == null) {
            jc.i.i("emptyView");
            throw null;
        }
        textView.setText(getString(i == 0 ? R.string.ldc_history_empty_gratis : R.string.ldc_history_empty_premium));
        q1 q1Var = this.P;
        if (q1Var != null) {
            q1Var.d(null);
        }
        this.P = b0.q(i0.e(this), null, new a2.g(lVarD, this, dVar, 2), 3);
    }
}

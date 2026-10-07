package h3;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.R;
import java.net.URLEncoder;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 extends androidx.fragment.app.s {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public n f4650f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public fa.w f4651g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f4652h0 = "";

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_temp_mail_inbox, viewGroup, false);
    }

    @Override // androidx.fragment.app.s
    public final void F() {
        fa.w wVar = this.f4651g0;
        if (wVar != null) {
            synchronized (((HashSet) wVar.f3866b)) {
                try {
                    for (q3.k kVar : (HashSet) wVar.f3866b) {
                        if (kVar.f8017y == this) {
                            kVar.b();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.N = true;
    }

    @Override // androidx.fragment.app.s
    public final void M(Bundle bundle, View view) {
        jc.i.e(view, "view");
        Bundle bundle2 = this.f977f;
        String string = bundle2 != null ? bundle2.getString("email") : null;
        if (string == null) {
            string = "";
        }
        this.f4652h0 = string;
        this.f4651g0 = com.bumptech.glide.d.v(U());
        final int i = 0;
        ((ImageView) view.findViewById(R.id.btnBackInbox)).setOnClickListener(new View.OnClickListener(this) { // from class: h3.a3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c3 f4620b;

            {
                this.f4620b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        this.f4620b.t().K();
                        break;
                    case 1:
                        c3 c3Var = this.f4620b;
                        ClipData clipDataNewPlainText = ClipData.newPlainText("Copied mail", c3Var.f4652h0);
                        Object systemService = c3Var.U().getSystemService("clipboard");
                        jc.i.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(clipDataNewPlainText);
                        Toast.makeText(c3Var.U(), c3Var.v(R.string.mail_copied), 0).show();
                        androidx.fragment.app.w wVarT = c3Var.T();
                        MainActivity mainActivity = wVarT instanceof MainActivity ? (MainActivity) wVarT : null;
                        if (mainActivity != null) {
                            mainActivity.z();
                        }
                        break;
                    default:
                        c3 c3Var2 = this.f4620b;
                        Toast.makeText(c3Var2.U(), c3Var2.v(R.string.searching_messages), 0).show();
                        c3Var2.b0();
                        break;
                }
            }
        });
        ((TextView) view.findViewById(R.id.textInboxEmail)).setText(this.f4652h0);
        final int i10 = 1;
        ((TextView) view.findViewById(R.id.btnCopyEmailInbox)).setOnClickListener(new View.OnClickListener(this) { // from class: h3.a3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c3 f4620b;

            {
                this.f4620b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        this.f4620b.t().K();
                        break;
                    case 1:
                        c3 c3Var = this.f4620b;
                        ClipData clipDataNewPlainText = ClipData.newPlainText("Copied mail", c3Var.f4652h0);
                        Object systemService = c3Var.U().getSystemService("clipboard");
                        jc.i.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(clipDataNewPlainText);
                        Toast.makeText(c3Var.U(), c3Var.v(R.string.mail_copied), 0).show();
                        androidx.fragment.app.w wVarT = c3Var.T();
                        MainActivity mainActivity = wVarT instanceof MainActivity ? (MainActivity) wVarT : null;
                        if (mainActivity != null) {
                            mainActivity.z();
                        }
                        break;
                    default:
                        c3 c3Var2 = this.f4620b;
                        Toast.makeText(c3Var2.U(), c3Var2.v(R.string.searching_messages), 0).show();
                        c3Var2.b0();
                        break;
                }
            }
        });
        final int i11 = 2;
        ((TextView) view.findViewById(R.id.btnRefreshInbox)).setOnClickListener(new View.OnClickListener(this) { // from class: h3.a3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c3 f4620b;

            {
                this.f4620b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        this.f4620b.t().K();
                        break;
                    case 1:
                        c3 c3Var = this.f4620b;
                        ClipData clipDataNewPlainText = ClipData.newPlainText("Copied mail", c3Var.f4652h0);
                        Object systemService = c3Var.U().getSystemService("clipboard");
                        jc.i.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(clipDataNewPlainText);
                        Toast.makeText(c3Var.U(), c3Var.v(R.string.mail_copied), 0).show();
                        androidx.fragment.app.w wVarT = c3Var.T();
                        MainActivity mainActivity = wVarT instanceof MainActivity ? (MainActivity) wVarT : null;
                        if (mainActivity != null) {
                            mainActivity.z();
                        }
                        break;
                    default:
                        c3 c3Var2 = this.f4620b;
                        Toast.makeText(c3Var2.U(), c3Var2.v(R.string.searching_messages), 0).show();
                        c3Var2.b0();
                        break;
                }
            }
        });
        View viewFindViewById = view.findViewById(R.id.recyclerInboxMessages);
        jc.i.d(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f4650f0 = new n(new c(this, 3), (byte) 0);
        U();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        n nVar = this.f4650f0;
        if (nVar == null) {
            jc.i.i("mailAdapter");
            throw null;
        }
        recyclerView.setAdapter(nVar);
        b0();
    }

    public final void b0() {
        View view = this.P;
        if (view == null) {
            return;
        }
        ((ProgressBar) view.findViewById(R.id.progressBarInbox)).setVisibility(0);
        r3.g gVar = new r3.g("https://api.catchmail.io/api/v1/mailbox?address=" + URLEncoder.encode(this.f4652h0, "UTF-8"), new b3(this, 2), new b3(this, 3));
        gVar.f8017y = this;
        fa.w wVar = this.f4651g0;
        if (wVar != null) {
            wVar.a(gVar);
        } else {
            jc.i.i("requestQueue");
            throw null;
        }
    }

    public final void c0(q3.n nVar) {
        Log.e("TempMailInbox", "Error: " + nVar.getMessage());
        Context contextR = r();
        if (contextR == null) {
            return;
        }
        q3.h hVar = nVar.f8019a;
        if (hVar == null || hVar.f7997a != 429) {
            Toast.makeText(contextR, contextR.getString(R.string.error_get_messages), 0).show();
        } else {
            Toast.makeText(contextR, contextR.getString(R.string.rate_limit), 0).show();
        }
    }
}

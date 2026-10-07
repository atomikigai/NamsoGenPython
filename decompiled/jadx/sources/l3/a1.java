package l3;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import app.namso_gen.spacehowen.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends x1.z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.fragment.app.w f6514d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h3.o f6515f;
    public boolean h;
    public u0 i;
    public List e = vb.q.f9297a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f6516g = "";

    public a1(androidx.fragment.app.w wVar) {
        this.f6514d = wVar;
    }

    @Override // x1.z
    public final int a() {
        return this.e.size();
    }

    @Override // x1.z
    public final void e(x1.w0 w0Var, int i) {
        String str;
        String str2;
        String str3;
        final z0 z0Var = (z0) w0Var;
        b1 b1Var = (b1) this.e.get(i);
        final int i10 = 1;
        final int i11 = 0;
        boolean z4 = b1Var.f6524b == 2 && jc.i.a(b1Var.a(), this.f6516g);
        pc.f fVar = n3.d.f7253a;
        String strC = n3.d.c(b1Var.f6523a);
        if (strC != null) {
            ((ImageView) z0Var.f6749u.f3391b).setVisibility(0);
            ((TextView) z0Var.f6749u.e).setVisibility(8);
            com.bumptech.glide.l lVarC = com.bumptech.glide.b.c(z0Var.f10230a);
            lVarC.getClass();
            new com.bumptech.glide.j(lVarC.f1878a, lVarC, Drawable.class, lVarC.f1879b).A(strC).y((ImageView) z0Var.f6749u.f3391b);
        } else {
            ((ImageView) z0Var.f6749u.f3391b).setVisibility(8);
            ((TextView) z0Var.f6749u.e).setVisibility(0);
            ((TextView) z0Var.f6749u.e).setText(n3.d.d(b1Var.f6523a));
        }
        TextView textView = (TextView) z0Var.f6749u.f3392c;
        if (z4) {
            str = "★ " + b1Var.f6523a.f7247b + ':' + b1Var.f6523a.f7248c;
        } else {
            str = b1Var.f6523a.f7247b + ':' + b1Var.f6523a.f7248c;
        }
        textView.setText(str);
        Log.d("KRYPT-PROXY", "render[" + i + "] " + b1Var.a() + ": país='" + b1Var.f6523a.f7250f + "' v=" + b1Var.f6523a.i + " claim='" + b1Var.f6523a.h + "' bandera='" + ((Object) ((TextView) z0Var.f6749u.e).getText()) + '\'');
        int i12 = b1Var.f6523a.f7246a;
        if (i12 == 1) {
            str2 = "HTTPS";
        } else if (i12 != 2) {
            str2 = i12 != 3 ? "HTTP" : "SOCKS4";
        } else {
            str2 = "SOCKS5";
        }
        TextView textView2 = (TextView) z0Var.f6749u.f3394f;
        StringBuilder sb2 = new StringBuilder();
        String strE = n3.d.e(b1Var.f6523a.f7250f);
        if (!b1Var.f6523a.i || strE.length() <= 0) {
            n3.c cVar = b1Var.f6523a;
            if (!cVar.i && (str3 = cVar.h) != null) {
                String strE2 = n3.d.e(str3);
                if (strE2.length() > 0) {
                    sb2.append(strE2);
                    sb2.append(' ');
                    sb2.append(this.f6514d.getString(R.string.proxy_country_claimed));
                    sb2.append(" · ");
                }
            }
        } else {
            sb2.append(strE);
            sb2.append(" · ");
        }
        sb2.append(str2);
        if (b1Var.f6523a.f7249d.length() > 0) {
            sb2.append(" · ");
            sb2.append(b1Var.f6523a.f7249d);
        }
        textView2.setText(sb2.toString());
        int i13 = b1Var.f6524b;
        if (i13 == 1) {
            ((TextView) z0Var.f6749u.f3395g).setText("…");
            ((TextView) z0Var.f6749u.f3395g).setTextColor(Color.parseColor("#FF9E9E9E"));
        } else if (i13 == 2) {
            ((TextView) z0Var.f6749u.f3395g).setText("✓ " + b1Var.f6525c + "ms");
            ((TextView) z0Var.f6749u.f3395g).setTextColor(this.f6514d.getColor(R.color.ok));
        } else if (i13 != 3) {
            ((TextView) z0Var.f6749u.f3395g).setText("·");
            ((TextView) z0Var.f6749u.f3395g).setTextColor(Color.parseColor("#FF666666"));
        } else {
            ((TextView) z0Var.f6749u.f3395g).setText("✗");
            ((TextView) z0Var.f6749u.f3395g).setTextColor(this.f6514d.getColor(R.color.danger));
        }
        ((LinearLayout) z0Var.f6749u.f3390a).setOnClickListener(new View.OnClickListener(this) { // from class: l3.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a1 f6743b;

            {
                this.f6743b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                RecyclerView recyclerView;
                x1.z adapter;
                int iJ;
                RecyclerView recyclerView2;
                x1.z adapter2;
                int iJ2;
                switch (i11) {
                    case 0:
                        a1 a1Var = this.f6743b;
                        h3.o oVar = a1Var.f6515f;
                        if (oVar != null) {
                            List list = a1Var.e;
                            z0 z0Var2 = z0Var;
                            int i14 = -1;
                            if (z0Var2.f10245s != null && (recyclerView = z0Var2.f10244r) != null && (adapter = recyclerView.getAdapter()) != null && (iJ = z0Var2.f10244r.J(z0Var2)) != -1 && z0Var2.f10245s == adapter) {
                                i14 = iJ;
                            }
                            oVar.invoke(list.get(i14));
                        }
                        break;
                    default:
                        a1 a1Var2 = this.f6743b;
                        u0 u0Var = a1Var2.i;
                        if (u0Var != null) {
                            List list2 = a1Var2.e;
                            z0 z0Var3 = z0Var;
                            int i15 = -1;
                            if (z0Var3.f10245s != null && (recyclerView2 = z0Var3.f10244r) != null && (adapter2 = recyclerView2.getAdapter()) != null && (iJ2 = z0Var3.f10244r.J(z0Var3)) != -1 && z0Var3.f10245s == adapter2) {
                                i15 = iJ2;
                            }
                            u0Var.invoke(list2.get(i15));
                        }
                        break;
                }
            }
        });
        ((TextView) z0Var.f6749u.f3393d).setVisibility(this.h ? 0 : 8);
        ((TextView) z0Var.f6749u.f3393d).setOnClickListener(new View.OnClickListener(this) { // from class: l3.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a1 f6743b;

            {
                this.f6743b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                RecyclerView recyclerView;
                x1.z adapter;
                int iJ;
                RecyclerView recyclerView2;
                x1.z adapter2;
                int iJ2;
                switch (i10) {
                    case 0:
                        a1 a1Var = this.f6743b;
                        h3.o oVar = a1Var.f6515f;
                        if (oVar != null) {
                            List list = a1Var.e;
                            z0 z0Var2 = z0Var;
                            int i14 = -1;
                            if (z0Var2.f10245s != null && (recyclerView = z0Var2.f10244r) != null && (adapter = recyclerView.getAdapter()) != null && (iJ = z0Var2.f10244r.J(z0Var2)) != -1 && z0Var2.f10245s == adapter) {
                                i14 = iJ;
                            }
                            oVar.invoke(list.get(i14));
                        }
                        break;
                    default:
                        a1 a1Var2 = this.f6743b;
                        u0 u0Var = a1Var2.i;
                        if (u0Var != null) {
                            List list2 = a1Var2.e;
                            z0 z0Var3 = z0Var;
                            int i15 = -1;
                            if (z0Var3.f10245s != null && (recyclerView2 = z0Var3.f10244r) != null && (adapter2 = recyclerView2.getAdapter()) != null && (iJ2 = z0Var3.f10244r.J(z0Var3)) != -1 && z0Var3.f10245s == adapter2) {
                                i15 = iJ2;
                            }
                            u0Var.invoke(list2.get(i15));
                        }
                        break;
                }
            }
        });
    }

    @Override // x1.z
    public final x1.w0 f(ViewGroup viewGroup) {
        return new z0(e6.q.c(this.f6514d.getLayoutInflater(), viewGroup));
    }
}

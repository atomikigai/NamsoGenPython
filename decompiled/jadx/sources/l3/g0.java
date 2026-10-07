package l3;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends x1.z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.w f6561d;
    public final /* synthetic */ ArrayList e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jc.q f6562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g.f f6563g;
    public final /* synthetic */ c3.j h;

    public g0(androidx.fragment.app.w wVar, ArrayList arrayList, jc.q qVar, g.f fVar, c3.j jVar) {
        this.f6561d = wVar;
        this.e = arrayList;
        this.f6562f = qVar;
        this.f6563g = fVar;
        this.h = jVar;
    }

    @Override // x1.z
    public final int a() {
        return this.e.size();
    }

    @Override // x1.z
    public final void e(x1.w0 w0Var, int i) {
        String str;
        String str2;
        e0 e0Var = (e0) w0Var;
        e6.q qVar = e0Var.f6548u;
        Object obj = this.e.get(i);
        jc.i.d(obj, "get(...)");
        n3.c cVar = (n3.c) obj;
        String strC = n3.d.c(cVar);
        if (strC != null) {
            ((ImageView) qVar.f3391b).setVisibility(0);
            ((TextView) qVar.e).setVisibility(8);
            com.bumptech.glide.l lVarC = com.bumptech.glide.b.c(e0Var.f10230a);
            lVarC.getClass();
            new com.bumptech.glide.j(lVarC.f1878a, lVarC, Drawable.class, lVarC.f1879b).A(strC).y((ImageView) qVar.f3391b);
        } else {
            ImageView imageView = (ImageView) qVar.f3391b;
            TextView textView = (TextView) qVar.e;
            imageView.setVisibility(8);
            textView.setVisibility(0);
            textView.setText(n3.d.d(cVar));
        }
        ((TextView) qVar.f3392c).setText(cVar.f7247b + ':' + cVar.f7248c);
        ((TextView) qVar.f3395g).setText("");
        int i10 = cVar.f7246a;
        if (i10 == 1) {
            str = "HTTPS";
        } else if (i10 != 2) {
            str = i10 != 3 ? "HTTP" : "SOCKS4";
        } else {
            str = "SOCKS5";
        }
        TextView textView2 = (TextView) qVar.f3394f;
        StringBuilder sb2 = new StringBuilder();
        String strE = n3.d.e(cVar.f7250f);
        boolean z4 = cVar.i;
        androidx.fragment.app.w wVar = this.f6561d;
        if (z4 && strE.length() > 0) {
            sb2.append(strE);
            sb2.append(" · ");
        } else if (!cVar.i && (str2 = cVar.h) != null) {
            String strE2 = n3.d.e(str2);
            if (strE2.length() > 0) {
                sb2.append(strE2);
                sb2.append(' ');
                sb2.append(wVar.getString(R.string.proxy_country_claimed));
                sb2.append(" · ");
            }
        }
        sb2.append(str);
        textView2.setText(sb2.toString());
        ((LinearLayout) qVar.f3390a).setOnClickListener(new f0(this.f6562f, cVar, this.f6563g, this.h, wVar, 0));
    }

    @Override // x1.z
    public final x1.w0 f(ViewGroup viewGroup) {
        return new e0(e6.q.c(this.f6561d.getLayoutInflater(), viewGroup));
    }
}

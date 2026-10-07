package h3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends x1.z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4710d;
    public List e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ic.l f4711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f4712g;

    public g2(b2 b2Var, b2 b2Var2) {
        this.f4710d = 0;
        this.e = vb.q.f9297a;
        this.f4711f = b2Var;
        this.f4712g = b2Var2;
    }

    @Override // x1.z
    public final int a() {
        switch (this.f4710d) {
            case 0:
                break;
        }
        return this.e.size();
    }

    @Override // x1.z
    public final void e(x1.w0 w0Var, int i) {
        String str;
        switch (this.f4710d) {
            case 0:
                f2 f2Var = (f2) w0Var;
                View view = f2Var.f10230a;
                final i3.o oVar = (i3.o) this.e.get(i);
                f2Var.f4696u.setText(oVar.f5192b);
                f2Var.f4697v.setText(oVar.f5193c);
                TextView textView = f2Var.f4698w;
                try {
                    str = new SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault()).format(new Date(oVar.e));
                    jc.i.b(str);
                } catch (Exception unused) {
                    str = "";
                }
                textView.setText(str);
                view.setOnClickListener(new d0(2, this, oVar));
                view.setOnLongClickListener(new View.OnLongClickListener() { // from class: h3.e2
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        ((b2) this.f4686a.f4712g).invoke(oVar);
                        return true;
                    }
                });
                break;
            default:
                l3.w wVar = (l3.w) w0Var;
                k3.m mVar = (k3.m) this.e.get(i);
                bd.u uVar = wVar.f6723u;
                ((TextView) uVar.e).setText(mVar.f5956b);
                TextView textView2 = (TextView) uVar.f1679f;
                View view2 = wVar.f10230a;
                Context context = view2.getContext();
                String str2 = mVar.f5955a;
                textView2.setText(context.getString(R.string.premium_proxy_residential_meta, str2));
                StringBuilder sb2 = new StringBuilder("https://flagcdn.com/h40/");
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                jc.i.d(lowerCase, "toLowerCase(...)");
                sb2.append(lowerCase);
                sb2.append(".png");
                String string = sb2.toString();
                Context context2 = view2.getContext();
                p4.f.c(context2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
                com.bumptech.glide.l lVarC = com.bumptech.glide.b.a(context2).e.c(context2);
                lVarC.getClass();
                new com.bumptech.glide.j(lVarC.f1878a, lVarC, Drawable.class, lVarC.f1879b).A(string).y((ImageView) uVar.f1676b);
                ((LinearLayout) uVar.f1677c).setOnClickListener(new d0(7, this, mVar));
                break;
        }
    }

    @Override // x1.z
    public final x1.w0 f(ViewGroup viewGroup) {
        switch (this.f4710d) {
            case 0:
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_notification, viewGroup, false);
                jc.i.b(viewInflate);
                return new f2(viewInflate);
            default:
                l3.y yVar = (l3.y) this.f4712g;
                LayoutInflater layoutInflaterH = yVar.U;
                if (layoutInflaterH == null) {
                    layoutInflaterH = yVar.H(null);
                    yVar.U = layoutInflaterH;
                }
                return new l3.w(bd.u.g(layoutInflaterH, viewGroup));
        }
    }

    public g2(l3.y yVar, ArrayList arrayList, c cVar) {
        this.f4710d = 1;
        jc.i.e(arrayList, "items");
        this.f4712g = yVar;
        this.e = arrayList;
        this.f4711f = cVar;
    }
}

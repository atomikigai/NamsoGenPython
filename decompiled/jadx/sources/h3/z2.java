package h3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 extends x1.z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v2 f4923d;
    public final v2 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f4924f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f4925g = new LinkedHashSet();
    public boolean h;

    public z2(v2 v2Var, v2 v2Var2) {
        this.f4923d = v2Var;
        this.e = v2Var2;
    }

    @Override // x1.z
    public final int a() {
        return this.f4924f.size();
    }

    @Override // x1.z
    public final void e(x1.w0 w0Var, int i) {
        String str;
        y2 y2Var = (y2) w0Var;
        CheckBox checkBox = y2Var.f4909w;
        i3.q qVar = (i3.q) this.f4924f.get(i);
        y2Var.f4907u.setText(qVar.f5196a);
        TextView textView = y2Var.f4908v;
        try {
            str = new SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault()).format(new Date(qVar.f5197b));
            jc.i.b(str);
        } catch (Exception unused) {
            str = "";
        }
        textView.setText(str);
        checkBox.setVisibility(this.h ? 0 : 8);
        checkBox.setChecked(this.f4925g.contains(qVar.f5196a));
        y2Var.f10230a.setOnClickListener(new d0(4, this, qVar));
    }

    @Override // x1.z
    public final x1.w0 f(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_temp_mail_history, viewGroup, false);
        jc.i.b(viewInflate);
        return new y2(viewInflate);
    }

    public final void k(boolean z4) {
        this.h = z4;
        LinkedHashSet linkedHashSet = this.f4925g;
        if (!z4) {
            linkedHashSet.clear();
        }
        c();
        this.e.invoke(Integer.valueOf(z4 ? linkedHashSet.size() : 0));
    }
}

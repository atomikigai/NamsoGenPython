package g9;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;
import q0.d0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends ArrayAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ColorStateList f4403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f4404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f4405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f4405c = wVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        w wVar = this.f4405c;
        ColorStateList colorStateList2 = wVar.f4412w;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f4404b = colorStateList;
        if (wVar.f4411v != 0 && wVar.f4412w != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{h0.a.b(wVar.f4412w.getColorForState(iArr3, 0), wVar.f4411v), h0.a.b(wVar.f4412w.getColorForState(iArr2, 0), wVar.f4411v), wVar.f4411v});
        }
        this.f4403a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            w wVar = this.f4405c;
            Drawable rippleDrawable = null;
            if (wVar.getText().toString().contentEquals(textView.getText()) && wVar.f4411v != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(wVar.f4411v);
                if (this.f4404b != null) {
                    i0.b.h(colorDrawable, this.f4403a);
                    rippleDrawable = new RippleDrawable(this.f4404b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = v0.f7946a;
            d0.q(textView, rippleDrawable);
        }
        return view2;
    }
}

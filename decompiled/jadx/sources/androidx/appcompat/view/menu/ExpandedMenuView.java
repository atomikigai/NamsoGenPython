package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.a0;
import k.k;
import k.l;
import k.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements k, a0, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f430b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f431a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        a2.l lVarG = a2.l.G(context, attributeSet, f430b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) lVarG.f44c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(lVarG.u(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(lVarG.u(1));
        }
        lVarG.I();
    }

    @Override // k.k
    public final boolean a(n nVar) {
        return this.f431a.q(nVar, null, 0);
    }

    @Override // k.a0
    public final void b(l lVar) {
        this.f431a = lVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        a((n) getAdapter().getItem(i));
    }
}

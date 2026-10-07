package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import w.a;
import w.d;
import z.b;
import z.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f549t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f550u;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // z.b
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        a aVar = new a();
        aVar.f9341s0 = 0;
        aVar.f9342t0 = true;
        aVar.f9343u0 = 0;
        aVar.f9344v0 = false;
        this.f550u = aVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f10854b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f550u.f9342t0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f550u.f9343u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f10721d = this.f550u;
        i();
    }

    public boolean getAllowsGoneWidget() {
        return this.f550u.f9342t0;
    }

    public int getMargin() {
        return this.f550u.f9343u0;
    }

    public int getType() {
        return this.f548s;
    }

    @Override // z.b
    public final void h(d dVar, boolean z4) {
        int i = this.f548s;
        this.f549t = i;
        if (z4) {
            if (i == 5) {
                this.f549t = 1;
            } else if (i == 6) {
                this.f549t = 0;
            }
        } else if (i == 5) {
            this.f549t = 0;
        } else if (i == 6) {
            this.f549t = 1;
        }
        if (dVar instanceof a) {
            ((a) dVar).f9341s0 = this.f549t;
        }
    }

    public void setAllowsGoneWidget(boolean z4) {
        this.f550u.f9342t0 = z4;
    }

    public void setDpMargin(int i) {
        this.f550u.f9343u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f550u.f9343u0 = i;
    }

    public void setType(int i) {
        this.f548s = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}

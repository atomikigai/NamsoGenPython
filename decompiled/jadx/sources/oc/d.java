package oc;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7709b;

    public /* synthetic */ d(Object obj, int i) {
        this.f7708a = i;
        this.f7709b = obj;
    }

    @Override // oc.e
    public final Iterator iterator() {
        switch (this.f7708a) {
            case 0:
                return new c(this);
            case 1:
                return (Iterator) this.f7709b;
            case 2:
                return new pc.d((CharSequence) this.f7709b);
            case 3:
                return new jc.a((ChipNavigationBar) this.f7709b, 2);
            default:
                return ((List) this.f7709b).iterator();
        }
    }
}

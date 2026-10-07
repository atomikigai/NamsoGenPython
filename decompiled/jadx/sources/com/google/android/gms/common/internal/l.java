package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends f implements com.google.android.gms.common.api.g {
    private static volatile Executor zaa;
    private final i zab;
    private final Set zac;
    private final Account zad;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(Context context, Looper looper, int i, i iVar, com.google.android.gms.common.api.internal.g gVar, com.google.android.gms.common.api.internal.q qVar) {
        s0 s0VarA = m.a(context);
        g7.e eVar = g7.e.e;
        i0.i(gVar);
        i0.i(qVar);
        super(context, looper, s0VarA, eVar, i, new t(gVar), new t(qVar), iVar.e);
        this.zab = iVar;
        this.zad = null;
        Set<Scope> set = iVar.f2195b;
        Set<Scope> setValidateScopes = validateScopes(set);
        Iterator<Scope> it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.zac = setValidateScopes;
    }

    @Override // com.google.android.gms.common.internal.f
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.f
    public Executor getBindServiceExecutor() {
        return null;
    }

    public final i getClientSettings() {
        return this.zab;
    }

    public g7.d[] getRequiredFeatures() {
        return new g7.d[0];
    }

    @Override // com.google.android.gms.common.internal.f
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.g
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.EMPTY_SET;
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}
